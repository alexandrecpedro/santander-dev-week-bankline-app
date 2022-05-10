package com.app.bankline.ui.statement

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.bankline.data.State
import com.app.bankline.databinding.ActivityBankStatementBinding
import com.app.bankline.domain.AccountHolder
import com.google.android.material.snackbar.Snackbar
import java.lang.IllegalArgumentException

class BankStatementActivity : AppCompatActivity() {
    /** Attributes or Properties **/
    // Static Attribute
    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "com.app.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    // Properties
    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        // do something. When comes null info (?:), stop and crashes the app
        intent.getParcelableExtra<AccountHolder>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }

    private val viewModel by viewModels<BankStatementViewModel>()

    /** Methods **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Get the RecyclerView
        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        // Method
        findBankStatement()

        // Binding should access SwipeRefresh
        binding.srlBankStatement.setOnRefreshListener { findBankStatement() }

        //TODO Melhoria (difícil): Incluir a funcionalidade de pesquisar na nossa ActionBar:
        //Referência: https://developer.android.com/training/search/setup
    }

    private fun findBankStatement() {
        viewModel.findBankStatement(accountHolder.id).observe(this) { state ->
            when(state) {
                is State.Success -> {
                    binding.rvBankStatement.adapter = state.data?.let { BankStatementAdapter(it) }
                    binding.srlBankStatement.isRefreshing = false
                }
                is State.Error -> {
                    state.message?.let { Snackbar.make(binding.rvBankStatement, it, Snackbar.LENGTH_LONG).show() }
                    binding.srlBankStatement.isRefreshing = false
                }
                is State.Wait -> binding.srlBankStatement.isRefreshing = true
            }
        }
    }
}