package com.example.kotlindome2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome2.Activity.ActesActivity
import com.example.kotlindome2.Adapter.MainAdapter
import com.example.kotlindome2.Utils.StartActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit:延迟加载，告诉kotlin编译器我会在晚些时候对这个变量进行初始化
    private lateinit var mainAdapter:MainAdapter
    var mainList = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()

    }

    private fun initData() {

        mainList.add("Activity")
        mainList.add("RecycleView")
        mainList.add("fragment")
        mainList.add("新闻")
        mainList.add("广播")

    }

    private fun initView() {
        val linearLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = linearLayoutManager
        //::mainAdapter.isInitialized判断全局变量是否初始化
        if (!::mainAdapter.isInitialized) {
            mainAdapter = MainAdapter(mainList)
            recy.adapter = mainAdapter
        }

        mainAdapter.setItemOnClike(object:MainAdapter.OnClike{
            override fun ItemOnclike(position: Int) {
                postActivity(position)
            }
        } )
    }

    private fun postActivity(position: Int) {
        var intent:Intent

        when(position){
            0 -> {
                Log.d("d","点击了")
               StartActivity.StartActesActivity(this,"长恨歌","将进酒")
            }
            1 -> {
                StartActivity.StratRecycleViewActivity(this)
            }
            2 -> {
                StartActivity.StartFragActivity(this)
            }
            3 -> {
                StartActivity.StartNewsTitleActivity(this)
            }
            4 -> {
                StartActivity.StartBroadcastActivity(this)
            }
        }
    }



}