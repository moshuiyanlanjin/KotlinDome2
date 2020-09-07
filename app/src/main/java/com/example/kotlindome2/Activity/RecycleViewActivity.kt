package com.example.kotlindome2.Activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome2.Adapter.RecyclerViewAdapter
import com.example.kotlindome2.R
import com.example.kotlindome2.Utils.StartActivity
import kotlinx.android.synthetic.main.activity_recycle.*

class RecycleViewActivity : BaseActivity() {

    var titleList = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)
        initData()

        initView()
    }

    private fun initView() {

        val linearLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = linearLayoutManager
        val adapter = RecyclerViewAdapter(titleList)
        recy.adapter = adapter
        adapter.setItemOnClke(object : RecyclerViewAdapter.OnClike{
            override fun ItemOnClike(position: Int) {
                postStart(position)
            }
        })
    }

    private fun postStart(position: Int) {

        when(position){
            0 -> {
                    StartActivity.StartWaterfallActivity(this)
            }
        }
    }

    private fun initData() {
        titleList.add("瀑布流")
        titleList.add("东成西就")
        titleList.add("战狼")
        titleList.add("我的团长我的团")

    }
}
