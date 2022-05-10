package com.app.bankline.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Infos could pass screen to screen
@Parcelize
data class AccountHolder(
    /** Attribute **/
    // val = const value | var = mutable value
    val id: Int
) : Parcelable
