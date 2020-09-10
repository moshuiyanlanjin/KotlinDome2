package com.example.kotlindome2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.Bean.News
import com.example.kotlindome2.R

class NewsTitleAdapter(val newsList:List<News>): RecyclerView.Adapter<NewsTitleAdapter.ViewHolder>(){

    lateinit var onClike:OnClike;
    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val newsTitle = view.findViewById<TextView>(R.id.newsTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsTitleAdapter.ViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        val viewHolder = ViewHolder(inflate)
        return viewHolder
    }

    override fun onBindViewHolder(holder: NewsTitleAdapter.ViewHolder, position: Int) {
        val news = newsList[position]
        holder.newsTitle.text = news.title
        holder.itemView.setOnClickListener {
            onClike.ItemOnclike(position)
        }
    }

    interface OnClike{
        fun ItemOnclike(position: Int)
    }

    fun setItemOnClike(onClike: OnClike){
        this.onClike = onClike
    }

    override fun getItemCount(): Int = newsList.size

}