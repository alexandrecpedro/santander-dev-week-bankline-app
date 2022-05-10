package com.app.bankline.data.remote

import com.app.bankline.domain.Transaction
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {
    // Async Method (Coroutine)
    @GET("/transactions/{id}")
    suspend fun findBankStatement(@Path("id") accountHolderId: Int): List<Transaction>
}