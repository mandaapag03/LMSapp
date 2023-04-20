package br.com.ahcatani.lmsapp3

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.ahcatani.lmsapp3.databinding.ActivityLoginBinding

class LoginActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_login)

        setContentView(binding.root)
        binding.imgLogin.setImageResource(R.drawable.img_sala)

        binding.btnLogin.setOnClickListener {
            onClickLogin()
        }

    }

    fun onClickLogin() {
        binding.msgLogin.text = "Faça o seu Login na Empresa"
        val builder = AlertDialog.Builder(this)
        if (!(binding.camUsuario.text.toString().equals("Elisa"))) {
            builder.setTitle("Informações do Login:")
            builder.setMessage("Usuário(a) NÂO Catatrado(a).")
            builder.create()
            builder.show()
        } else if (!(binding.camPassword.text.toString().equals("12345"))) {
            builder.setTitle("Informações do Login:")
            builder.setMessage("Password Inválida.")
            builder.create()
            builder.show()
        } else {
            val intent = Intent(context, TelaInicialActivity::class.java)
            startActivity(intent)
        }
    }

}
