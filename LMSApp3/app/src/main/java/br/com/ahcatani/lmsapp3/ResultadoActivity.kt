package br.com.ahcatani.lmsapp3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ahcatani.lmsapp3.databinding.ActivityResultadoBinding

class ResultadoActivity : DebugActivity() {

    private val binding by lazy {
        ActivityResultadoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSair.setOnClickListener {
            onClickSair()
        }
    }

    fun onClickSair() {
        val returnIntent = Intent()
        var msg = "Saída do LMSApp3"
        returnIntent.putExtra("result", msg.toString());
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}