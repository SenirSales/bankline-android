package me.dio.bankline.domian

import com.google.gson.annotations.SerializedName

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    @SerializedName("idConta")
    //TODO Mapper "idConta -> idCorretista"
    val idCorrentista: Int
)
