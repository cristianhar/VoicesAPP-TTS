package com.example.clase_2

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale


class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener{

    private var tts: TextToSpeech? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tts = TextToSpeech(this,this)
        findViewById<Button>(R.id.btEnviar).setOnClickListener{
            hablar()
        }

    }

    private fun hablar() {
        val mensaje:String = findViewById<EditText>(R.id.etMensaje).text.toString()
        if(mensaje.isEmpty()){
            findViewById<TextView>(R.id.tvMensaje).text = "Escribe algo! (¬_¬)"
        }else {
            tts?.speak(mensaje, TextToSpeech.QUEUE_FLUSH, null, "")
        }
    }

    override fun onInit(status: Int) {
        if(status == TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.tvMensaje).text = "Listo! ╰(*°▽°*)╯"
            tts!!.setLanguage(Locale("ES"))
        }else {
            findViewById<TextView>(R.id.tvMensaje).text = "Error! (╥﹏╥)"
        }
    }

    override fun onDestroy(){
        if(tts != null){
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }


}