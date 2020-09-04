package com.example.kotlindome2.Utils

import androidx.appcompat.app.AppCompatActivity

object ActivityCollector {
    var ActivityList = mutableListOf<AppCompatActivity>()

    fun AddActivity(activity: AppCompatActivity){
        ActivityList.add(activity)
    }

    fun RemoveActivity(activity: AppCompatActivity){
        ActivityList.remove(activity)
    }

    fun FinshAllActivity(){
        for (act in ActivityList){
            act.finish()
        }
    }
}