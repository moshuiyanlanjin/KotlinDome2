package com.example.kotlindome2.Activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlindome2.MainActivity
import com.example.kotlindome2.Utils.ActivityCollector
import com.example.kotlindome2.Utils.LogUtils

open class BaseActivity : AppCompatActivity(){
    lateinit var receive : ForceOfflineReceive
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d(this,"当前的Activity是${javaClass.simpleName}")
        ActivityCollector.AddActivity(this)
    }

    override fun onResume() {
        super.onResume()
        val intentFilter = IntentFilter()
        intentFilter.addAction("com.example.CORRE")
        receive = ForceOfflineReceive()
        registerReceiver(receive,intentFilter)
    }

    inner class ForceOfflineReceive : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            Log.d("广播收到了","关闭")
            p0?.let {
                AlertDialog.Builder(it).apply {
                    setTitle("退出登录")
                    setMessage("是否退出登录")
                    setCancelable(false)
                    setPositiveButton("确定"){_,_->
                        ActivityCollector.FinshAllActivity()
                        val i = Intent(p0,MainActivity::class.java)
                        p0.startActivity(i)
                    }
                    show()
                }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.RemoveActivity(this)
    }
}