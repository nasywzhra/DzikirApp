package com.nasywa.dzikirapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ArtikelAdapter(private val listArtikel: ArrayList<com.nasywa.dzikirapp.model.Artikel>):RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_artikel, parent, false))


    private lateinit var onItemClikCallback:OnItemClikCallback

    fun setOnClikedCallBack(onItemClikCallback: OnItemClikCallback){
        this.onItemClikCallback=onItemClikCallback
    }
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgArtikel= view.findViewById<ImageView>(R.id.ivArtikel)



    }

    override fun onBindViewHolder(holder: ArtikelAdapter.MyViewHolder, position: Int) {
         holder.imgArtikel.setImageResource(listArtikel[position].imageArtikel)
         holder.itemView.setOnClickListener {
             onItemClikCallback.onItemCliked(listArtikel[position])
         }
    }

    override fun getItemCount(): Int =listArtikel.size
}

interface OnItemClikCallback {
    fun onItemCliked (data: com.nasywa.dzikirapp.model.Artikel)

}
