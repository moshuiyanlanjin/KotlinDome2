package com.example.kotlindome2.BroadcastReceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("我接受到了广播","eee")
        //截断广播传输
        abortBroadcast()
    }
}
