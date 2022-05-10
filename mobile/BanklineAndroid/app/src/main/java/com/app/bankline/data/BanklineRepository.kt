package com.app.bankline.data

import android.util.Log
import androidx.lifecycle.liveData
import com.app.bankline.data.remote.BanklineApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/** Singleton Pattern to avoid remaking Retrofit service **/
object BanklineRepository {
    /** Attributes **/
    private val TAG = javaClass.simpleName

    // This property will never be instantiated more than once
    private val restApi by lazy {
        Retrofit.Builder()
            /* the baseUrl cannot be http://localhost:${port_number}/"
            * The emulator does not understand localhost, but 10.0.2.2 */
            .baseUrl("http://10.0.2.2:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            // it should be create using as base the BanklineApi class (our interface)
            .create(BanklineApi::class.java)
    }

    /** Method **/
    fun findBankStatement(accountHolderId: Int) = liveData {
        // Emit wait state for an observer
        emit(State.Wait)
        try {
            // Emit a success state for an observer
            emit(State.Success(data = restApi.findBankStatement(accountHolderId)))
        } catch (e: Exception) {
            // Identify the error by its className
            Log.e(TAG, e.message, e)
            emit(State.Error(e.message))
        }
    }

    /* TODO Melhoria (difícil): Incluir o Room para persistência local das Movimentações.
    * Para isso, nosso Repository pode evoluir negocialmente para expor os dados locais
    * via LiveData através do Room.
    * Assim, o App poderá funcionar offline, apresentando as Movimentações da última
    * requisição HTTP realizada com sucesso. */
}