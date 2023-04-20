package br.com.ahcatani.lmsapp3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ahcatani.lmsapp3.databinding.ActivityParametroBinding

class ParametroActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityParametroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val numero = intent.getIntExtra("numero", 0)
        binding.camParametro.text = "Parâmetro: " + numero
    }
}