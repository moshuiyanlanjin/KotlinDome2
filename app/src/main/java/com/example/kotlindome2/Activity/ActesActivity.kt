package com.example.kotlindome2.Activity

import android.os.Bundle
import android.util.Log
import com.example.kotlindome2.Utils.LogUtils

class ActesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d(this,"当前传入的参数是：${intent.getStringExtra("data1")},${intent.getStringExtra("data2")}")
        Log.d("","当前传入的参数是：${intent.getStringExtra("data1")},${intent.getStringExtra("data2")}")
    }

}
