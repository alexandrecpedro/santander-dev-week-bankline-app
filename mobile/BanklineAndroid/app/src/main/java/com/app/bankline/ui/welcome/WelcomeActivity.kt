package com.app.bankline.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.bankline.R
import com.app.bankline.databinding.ActivityWelcomeBinding
import com.app.bankline.domain.AccountHolder
import com.app.bankline.ui.statement.BankStatementActivity

class WelcomeActivity : AppCompatActivity() {
    /** Property **/
    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    /** Methods **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Method for button when pressed
        binding.btContinue.setOnClickListener {

            //TODO Melhoria (fácil): validar o preenchimento do ID do Correntista, exibindo um Snackbar em caso de erro.
            //TODO Melhoria (difícil): evoluir a API para recuperar um Correntista por ID, permitindo assim o envio de mais informações para a próxima tela.

            val accountHolderId = binding.etAccountHolderId.text.toString().toInt()
            val accountHolder = AccountHolder(accountHolderId)

            // Intent to redirect this to other screen
            // Reference: https://developer.android.com/training/basics/firstapp/starting-activity
            val intent = Intent(this, BankStatementActivity::class.java).apply {
                // putExtra(key, value)
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
            }
            // Start the activity from this intent
            startActivity(intent)
        }
    }
}