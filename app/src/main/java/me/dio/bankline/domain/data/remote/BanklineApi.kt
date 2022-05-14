package me.dio.bankline.domain.data.remote

import me.dio.bankline.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {

    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountHandleId: Int): List<Movimentacao>
}