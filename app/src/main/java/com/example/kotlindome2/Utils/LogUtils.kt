package com.example.kotlindome2.Utils

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

object LogUtils {
    fun d(activity: AppCompatActivity,str:String){
        Log.d(activity.javaClass.simpleName,str)
    }
}
