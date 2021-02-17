package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = btCalcular
        val resultado = resultado

        btCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(primeiraNota.text.toString())
            val nota2 = Integer.parseInt(segundaNota.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media > 6 && faltas <=10){
                resultado.setText("Aluno foi aprovado\nNota final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Aluno foi reprovado\nNota final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}