package com.app.bankline.ui.statement

import androidx.lifecycle.ViewModel
import com.app.bankline.data.BanklineRepository

class BankStatementViewModel : ViewModel() {
    // Method between API and ViewModel => search the bank statement
    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}