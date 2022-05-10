package com.app.bankline.data

// Output = generic parameter (T)
sealed class State<out T> {
    /** Data Classes **/
    // Output = parameter made in execution time (R = response) as a optional property
    // This class extends from State<R? (optional parameter) >
    data class Success<out R>(val data: R? = null) : State<R?>()

    // State<Nothing> = No aditional data will be informed
    data class Error(val message: String? = null) : State<Nothing>()

    // Nothing will be stored here
    object Wait : State<Nothing>()

}
