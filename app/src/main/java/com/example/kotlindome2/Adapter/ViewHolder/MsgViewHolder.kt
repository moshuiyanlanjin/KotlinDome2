package com.example.kotlindome2.Adapter.ViewHolder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.msg_left_item.view.*

sealed class MsgViewHolder(view:View):RecyclerView.ViewHolder(view){
    class LeftViewHolder(view:View):MsgViewHolder(view){
        val leftMsg:TextView = view.findViewById(R.id.leftMsg)
    }

    class RightViewHolder(view:View):MsgViewHolder(view){
        val rightMsg:TextView = view.findViewById(R.id.rightMsg)
    }
}