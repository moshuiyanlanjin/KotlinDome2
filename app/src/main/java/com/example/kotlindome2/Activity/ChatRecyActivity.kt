package com.example.kotlindome2.Activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome2.Adapter.MsgAdapter
import com.example.kotlindome2.Bean.Msg
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.activity_chat_recy.*

class ChatRecyActivity : BaseActivity() {

    private var msgList = mutableListOf<Msg>()
    private lateinit var adapter: MsgAdapter;
    var type = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_recy)

        initData()

        initView()
    }

    private fun initView() {

        val linearLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = linearLayoutManager
        adapter = MsgAdapter(msgList)
        recy.adapter = adapter

        send.setOnClickListener {
            var content = inputText.text.toString()
            if (type == 1) {
                type = 0
                msgList.add(Msg(content,Msg.TYPE_SEMT))
            } else {
                type = 1
                msgList.add(Msg(content,Msg.TYOPE_RECEIVED))
            }
            adapter!!.notifyItemChanged(msgList.size-1)
            recy.scrollToPosition(msgList.size-1)
            inputText.setText("")
        }
    }

    private fun initData() {


    }

}
