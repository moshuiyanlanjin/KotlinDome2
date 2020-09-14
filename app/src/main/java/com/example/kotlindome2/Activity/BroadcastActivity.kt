package com.example.kotlindome2.Activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.activity_broadcast.*

class BroadcastActivity : BaseActivity(){
    lateinit var timeChangReceiver:TimeChangReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        val intentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.TIME_TICK")
        val timeChangReceiver = TimeChangReceiver()
        registerReceiver(timeChangReceiver,intentFilter)
        initView()
    }

    private fun initView() {
        sendbt.setText("sssssssssssssss")

        sendbt.setOnClickListener {
            Log.d("我点击了：","ex")
            val intent = Intent("com.example.broadcasttest.MY_BROADCAST")
            //传入包名，packageName用于获取当前应用程序的包名，在8.0后静态注册的BroadcastReceiver是无法接受注册的隐式广播的，而默认情况下
            //我们发送的自定义广播恰恰都是隐式广播，所以这里一定要调用setPackage方法，指定这条广播是发送给哪个程序的，从而让它变成一条显式广播
            intent.setPackage(packageName)
            //发送标准广播
            //sendBroadcast(intent)
            //发送有序广播
            sendOrderedBroadcast(intent,null)
        }
    }

    inner class TimeChangReceiver : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            Toast.makeText(p0,"时间变化了",Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(timeChangReceiver)
    }
}


