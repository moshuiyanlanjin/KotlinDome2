package com.example.kotlindome2.Activity

import android.content.res.Resources
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlindome2.Adapter.WaterfallAdapter
import com.example.kotlindome2.Bean.Fruit
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.avtivity_waterfall.*

class WaterfallActivity : BaseActivity() {

    var fruitList = mutableListOf<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avtivity_waterfall)

        initData()

        initView()
    }

    private fun initView() {
        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recy.layoutManager = staggeredGridLayoutManager
        val adapter = WaterfallAdapter(fruitList)
        recy.adapter = adapter
    }

    private fun initData() {
        repeat(5){
            fruitList.add(Fruit(getRandomLengthString("将进酒"),R.mipmap.caomei))
            fruitList.add(Fruit(getRandomLengthString("静夜思"),R.mipmap.yingtao))
            fruitList.add(Fruit(getRandomLengthString("悲白发"),R.mipmap.jihe))
            fruitList.add(Fruit(getRandomLengthString("万古如长夜"),R.mipmap.xigua))
        }

    }

    /**
     * 随机数
     */
    private fun getRandomLengthString(str:String):String{
        val n = (1..20).random()
        val builder = StringBuffer()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }
}
