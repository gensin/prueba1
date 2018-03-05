package com.gensin.listadenombres

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.lista_de_nombres_item.view.*

/**
 * Created on 05/03/2018.
 */
class NombresAdapter (private val nombres : ArrayList<String>) : RecyclerView.Adapter<NombresAdapter.NombreHolder>(){

    override fun getItemCount() = nombres.size


    override fun onBindViewHolder(holder: NombreHolder, position: Int) {
        val item = nombres[position]
        holder.bindPhoto(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NombresAdapter.NombreHolder {
        val inflatedView = parent.inflate(R.layout.lista_de_nombres_item, false)
        return NombreHolder(inflatedView)
    }

    class NombreHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var v: View = v
        private var nombre: String = ""

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val context = itemView.context
            val showName = Intent(context, Screen2::class.java)
            showName.putExtra(NAME_KEY, nombre)
            context.startActivity(showName)
        }

        companion object {
            //5
            private val NAME_KEY = "NAME"
        }

        fun bindPhoto(name: String) {
            v.nombre.text = nombre
        }
    }

}