package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val datalist: ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemview)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = datalist[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitulo.text = currentItem.dataTitle
    }

    class ViewHolderClass(itemview: View): RecyclerView.ViewHolder(itemview) {
        val rvImage: ImageView = itemview.findViewById(R.id.ic_list)
        val rvTitulo: TextView = itemview.findViewById(R.id.titulo)

    }
}

