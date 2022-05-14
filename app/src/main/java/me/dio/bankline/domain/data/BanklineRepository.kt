package me.dio.bankline.domain.data

import android.util.Log
import androidx.lifecycle.liveData
import me.dio.bankline.domain.data.remote.BanklineApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

object BanklineRepository {

    private val TAG = javaClass.simpleName

    private val respApi by lazy {
        Retrofit.Builder()
            .baseUrl("http://10.0.0.118:8080")
            .addConverterFactory((GsonConverterFactory.create()))
            .build()
            .create(BanklineApi::class.java)
    }
    fun findBankStatement(accountHandleId: Int) = liveData {
        emit(State.Wait)
        try {
            emit(State.Sucesso(data = respApi.findBankStatement(accountHandleId)))
        } catch (e: Exception) {
            Log.e(TAG, e.message, e)
            emit(State.Error(e.message))
        }
    }
}