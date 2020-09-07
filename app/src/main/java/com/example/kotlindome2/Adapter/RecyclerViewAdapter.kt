package com.example.kotlindome2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.R

class RecyclerViewAdapter(titleList: MutableList<String>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var titleList : MutableList<String>;
    lateinit var onClike:OnClike
    init {
        this.titleList = titleList
    }
    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        val text = view.findViewById<TextView>(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {

        val  view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle, parent, false)
        return  ViewHolder(view)
    }

    interface OnClike{
        fun ItemOnClike(position: Int)
    }
    fun setItemOnClke(onClike: OnClike){
        this.onClike = onClike
    }
    override fun getItemCount(): Int = titleList.size

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        val list = titleList[position]
        holder.text.setText(list)
        holder.text.setOnClickListener {
            onClike.ItemOnClike(position)
        }
    }

}
