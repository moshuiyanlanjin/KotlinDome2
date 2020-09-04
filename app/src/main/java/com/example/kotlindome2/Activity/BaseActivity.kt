package com.example.kotlindome2.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlindome2.Utils.ActivityCollector
import com.example.kotlindome2.Utils.LogUtils

open class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d(this,"当前的Activity是${javaClass.simpleName}")
        ActivityCollector.AddActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.RemoveActivity(this)
    }
}