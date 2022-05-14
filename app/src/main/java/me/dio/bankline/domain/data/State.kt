package me.dio.bankline.domain.data

sealed class State<out T> {
    data class  Sucesso<out R>(val data: R? = null) : State<R?>()
    data class  Error(val message: String? = null) : State<Nothing>()
    object Wait : State<Nothing>()
}