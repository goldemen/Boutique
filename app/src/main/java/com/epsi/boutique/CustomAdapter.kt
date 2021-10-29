package com.epsi.boutique

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardViewDesign = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design,parent, false)
        return ViewHolder(cardViewDesign)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("XXX","onBindViewHolder")

        val ItemsViewModel = mList[position]
        holder.imageView.setImageResource(ItemsViewModel.image)

        holder.textView.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int{
        return mList.size
    }

    class ViewHolder(elementDeListe : View) : RecyclerView.ViewHolder(elementDeListe)
    {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val textView: TextView = itemView.findViewById(R.id.nom_montre)
    }
}