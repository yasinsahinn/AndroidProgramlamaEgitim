package com.yasinsahin.kahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.graphics.get
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class recyclerAdapter(val takimListesi:ArrayList<String>,val takimFotolari:ArrayList<Int>):RecyclerView.Adapter<recyclerAdapter.TakimVH>() {
    class TakimVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TakimVH {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return TakimVH(itemView)
    }

    override fun getItemCount(): Int {
        return takimListesi.size


    }


    override fun onBindViewHolder(holder: TakimVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = takimListesi.get(position)
        holder.itemView.setOnClickListener {
        val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
        intent.putExtra("takimIsmi",takimListesi.get(position))
        intent.putExtra("takimGorseli",takimFotolari.get(position))
       /* val singleton=SingletonClass.secilenTakimGorsel
        singleton.gorsel=takimFotolari.get(position)*/
        holder.itemView.context.startActivity(intent)
    }
}



}