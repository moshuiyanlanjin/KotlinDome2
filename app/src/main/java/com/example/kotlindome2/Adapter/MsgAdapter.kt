package com.example.kotlindome2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.Bean.Msg
import com.example.kotlindome2.R

class MsgAdapter (val msgList: MutableList<Msg>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    inner class LiftViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val leftMsg:TextView = view.findViewById(R.id.leftMsg)
    }
    inner class RightViewHolder(view :View):RecyclerView.ViewHolder(view){
        val rightMsg : TextView = view.findViewById(R.id.rightMsg)
    }

    override fun getItemViewType(position: Int): Int {
        val msg = msgList[position]
        return msg.type
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = if(viewType == Msg.TYOPE_RECEIVED ){
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_left_item,parent,false)
        LiftViewHolder(view)
    }else{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_right_item,parent,false)
        RightViewHolder(view)
    }
    override fun getItemCount(): Int = msgList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int){

    val msg = msgList[position]
        when(holder){
            is LiftViewHolder -> holder.leftMsg.text = msg.content
            is RightViewHolder -> holder.rightMsg.text = msg.content
        }
    }

}