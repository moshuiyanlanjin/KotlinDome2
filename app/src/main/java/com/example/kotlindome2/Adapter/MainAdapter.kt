package com.example.kotlindome2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.R

class MainAdapter(mainList: MutableList<String>) : RecyclerView.Adapter<MainAdapter.ViewHolder>(){

    private lateinit var mainList : MutableList<String>
    lateinit var onClike:OnClike
    init {
        this.mainList = mainList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = mainList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt.setText(mainList[position])
        holder.itemView.setOnClickListener{onClike.ItemOnclike(position)}
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val txt:TextView = view.findViewById(R.id.txt)

    }

    interface OnClike{
        fun ItemOnclike(position: Int)
    }

    fun setItemOnClike(onClike :OnClike){
        this.onClike = onClike
    }
}
