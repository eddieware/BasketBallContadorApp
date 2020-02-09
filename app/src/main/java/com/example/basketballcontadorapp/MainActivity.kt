package com.example.basketballcontadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counterA:Int = 0
    var counterB:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    public fun contadorA3(view: View){
        counterA=counterA+3
        scoreA.text = counterA.toString()

    }
    public fun contadorA2(view: View){
        counterA=counterA+2
        scoreA.text = counterA.toString()

    }

    public fun contadorA1(view: View){
        counterA++
        scoreA.text = counterA.toString()

    }

    public fun contadorB3(view: View){
        counterB=counterB+3
        scoreB.text = counterB.toString()

    }
    public fun contadorB2(view: View){
        counterB=counterB+2
        scoreB.text = counterB.toString()

    }
    public fun contadorB1(view: View){
        counterB++
        scoreB.text = counterB.toString()

    }

// funcion para sacar el Toeas ya que no se si el tiro libre aumenta el marcaedor
    public fun tiroLibre(view: View){
        Toast.makeText(this,"Tiro Libre",Toast.LENGTH_LONG).show()

    }
// Funcion para limpiar


    public fun resetcontadores(view: View){
        counterA=0
        counterB=0
        scoreA.text = counterA.toString()
        scoreB.text = counterB.toString()

    }
}
