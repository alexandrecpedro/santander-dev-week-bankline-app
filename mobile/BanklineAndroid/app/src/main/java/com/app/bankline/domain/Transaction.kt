package com.app.bankline.domain

import com.google.gson.annotations.SerializedName

data class Transaction(
    // Attributes
    val id: Int,
    val dateTime: String,
    val description: String,
    val value: Double,
    val type: TransactionType,
    @SerializedName("idAccount")
    val idAccountHolder: Int
)
