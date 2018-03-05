package com.gensin.listadenombres

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)
        lista_de_nombres.layoutManager = LinearLayoutManager(this)
        lista_de_nombres.adapter = NombresAdapter()
    }
}
