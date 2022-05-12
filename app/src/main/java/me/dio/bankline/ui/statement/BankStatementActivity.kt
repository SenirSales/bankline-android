package me.dio.bankline.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import me.dio.bankline.R
import me.dio.bankline.databinding.ActiveWelcomeBinding
import me.dio.bankline.databinding.ActivityBankStatementBinding
import me.dio.bankline.domian.Correntista
import me.dio.bankline.domian.Movimentacao
import me.dio.bankline.domian.TipoMovimentacao

class BankStatementActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "me.dio.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //      Log.d("Teste", "Chegou o ID: ${accountHolder.id}")
        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        findBankStatement()

    }

    private fun findBankStatement() {
        val dataSet = ArrayList<Movimentacao>()
        // Add itens ao iniciar a aplicacao pela primeira vez
        //        dataSet.add(Movimentacao(1,"03/05/2022", "Ipsum", 1000.00, TipoMovimentacao.RECEITA, idCorrentista = 1 ))
        //        dataSet.add(Movimentacao(1,"03/05/2022", "Ipsum", 1000.00, TipoMovimentacao.DESPESA, idCorrentista = 1 ))
        //        dataSet.add(Movimentacao(1,"03/05/2022", "Ipsum", 1000.00, TipoMovimentacao.RECEITA, idCorrentista = 1 ))
        //        dataSet.add(Movimentacao(1,"03/05/2022", "Ipsum", 1000.00, TipoMovimentacao.DESPESA, idCorrentista = 1 ))
        //        dataSet.add(Movimentacao(1,"03/05/2022", "Ipsum", 1000.00, TipoMovimentacao.RECEITA, idCorrentista = 1 ))
        //        binding.rvBankStatement.adapter = BankStatementAdapter(dataSet)
    }
}