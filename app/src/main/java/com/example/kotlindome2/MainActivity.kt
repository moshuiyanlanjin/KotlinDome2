package com.example.kotlindome2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome2.Activity.ActesActivity
import com.example.kotlindome2.Adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mainList = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()

    }

    private fun initData() {

        mainList.add("Activity")

    }

    private fun initView() {
        val linearLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = linearLayoutManager
        val mainAdapter = MainAdapter(mainList)
        recy.adapter = mainAdapter

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
                intent = Intent(this, ActesActivity::class.java)
                startActivity(intent)
            }

        }
    }


}