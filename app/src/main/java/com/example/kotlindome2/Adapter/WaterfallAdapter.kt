package com.example.kotlindome2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.Bean.Fruit
import com.example.kotlindome2.R

class WaterfallAdapter(fruitList: MutableList<Fruit>) : RecyclerView.Adapter<WaterfallAdapter.ViewHolder>() {
    var fruitList:MutableList<Fruit>
    init {
        this.fruitList = fruitList
    }
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.image)
        val text = view.findViewById<TextView>(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_waterfall,
            parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.setText(fruitList[position].name)
        holder.image.setImageResource(fruitList[position].color)
    }

    override fun getItemCount(): Int = fruitList.size

}
