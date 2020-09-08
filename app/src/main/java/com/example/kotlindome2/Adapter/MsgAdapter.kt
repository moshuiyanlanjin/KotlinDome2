package com.example.kotlindome2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.Adapter.ViewHolder.MsgViewHolder
import com.example.kotlindome2.Bean.Msg
import com.example.kotlindome2.R

class MsgAdapter (val msgList: MutableList<Msg>):RecyclerView.Adapter<MsgViewHolder>(){


    override fun getItemViewType(position: Int): Int {
        val msg = msgList[position]
        return msg.type
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = if(viewType == Msg.TYOPE_RECEIVED ){
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_left_item,parent,false)
        MsgViewHolder.LeftViewHolder(view)
    }else{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_right_item,parent,false)
        MsgViewHolder.RightViewHolder(view)
    }
    override fun getItemCount(): Int = msgList.size

    override fun onBindViewHolder(holder: MsgViewHolder, position: Int){

    val msg = msgList[position]
        when(holder){
            is MsgViewHolder.LeftViewHolder -> holder.leftMsg.text = msg.content
            is MsgViewHolder.RightViewHolder -> holder.rightMsg.text = msg.content
        }
    }

}