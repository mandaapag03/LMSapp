package br.com.ahcatani.lmsapp3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ahcatani.lmsapp3.databinding.ActivityPaisesBinding

class PaisesActivity : AppCompatActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityPaisesBinding.inflate(layoutInflater)
    }

    val paises = listOf("Alemanha",
        "Brasil",
        "Estados Unidos",
        "Inglaterra",
        "Italia")
    val localizacao = listOf("Europa",
        "América do Sul",
        "América do Norte",
        "Europa",
        "Europa")
    val idioma = listOf("alemão", "português", "inglês", "inglês", "italiano")
    val habitantes = listOf("81.166.671",
        "190.732.094",
        "331.893.745",
        "55.619.400",
        "59.030.133")
    val area = listOf("356.733 Km2",
        "8.503.872 Km2",
        "9.831.510 Km2",
        "130.395 Km2",
        "301.388 Km2")
    val bandeira = listOf(R.drawable.img_bandeira_alemanha,
        R.drawable.img_bandeira_brasil,
        R.drawable.img_bandeira_usa,
        R.drawable.img_bandeira_inglaterra,
        R.drawable.img_bandeira_italia)
    val mapa = listOf(R.drawable.img_mapa_alemanha,
        R.drawable.img_mapa_brasil,
        R.drawable.img_mapa_usa,
        R.drawable.img_mapa_inglaterra,
        R.drawable.img_mapa_italia)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val args = intent.extras
        val pais = args?.getString("nome")
        val pos = paises.indexOf(pais)
        binding.camPais.text = pais
        binding.camLocalizacao.text = localizacao[pos]
        binding.camHabitantes.text = habitantes[pos].toString()
        binding.camArea.text = area[pos].toString()
        binding.camIdioma.text = idioma[pos]
        binding.imgBandeira.setImageResource(bandeira[pos])
        binding.imgMapa.setImageResource(mapa[pos])
    }
}