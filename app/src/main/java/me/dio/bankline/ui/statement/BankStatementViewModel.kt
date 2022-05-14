package me.dio.bankline.ui.statement

import androidx.lifecycle.ViewModel
import me.dio.bankline.domain.data.BanklineRepository

class BankStatementViewModel : ViewModel(){

    fun findBankStatement(accountHandleId: Int) =
        BanklineRepository.findBankStatement(accountHandleId)
}