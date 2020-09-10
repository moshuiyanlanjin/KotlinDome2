package com.example.kotlindome2.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome2.Adapter.NewsTitleAdapter
import com.example.kotlindome2.Bean.News
import com.example.kotlindome2.R
import com.example.kotlindome2.Utils.StartActivity
import kotlinx.android.synthetic.main.activity_news_title.*
import kotlinx.android.synthetic.main.frag_news_title.*
import java.lang.StringBuilder

class NewTitleFragment :Fragment(){
    private var isTwoPane = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_news_title,container,false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isTwoPane = activity?.findViewById<View>(R.id.newsContentFrag) != null
        val news = getNews()
        val linearLayoutManager = LinearLayoutManager(activity)
        newsTitleRecy.layoutManager = linearLayoutManager
        val adapter = NewsTitleAdapter(news)
        newsTitleRecy.adapter =adapter
        adapter.setItemOnClike(object : NewsTitleAdapter.OnClike{
            override fun ItemOnclike(position: Int) {
                val news1 = news[position]
                if(isTwoPane){
                    val fragment = newsContentFrag as NewsContentFragment
                    fragment.refresh(news1.title,news1.content)
                }else{
                    activity?.let { StartActivity.StartNewsContentActivity(it,news1.title,news1.content) }
                }
            }
        })
    }

    private fun getNews(): List<News> {
        val newsList = mutableListOf<News>()
        for (i in 1..50){
            val news = News("我是标题$i",getRandomLengthString("我是内容$i"))
            newsList.add(news)
        }
        return newsList
    }

    private fun getRandomLengthString(s: String): String {
        val n = (1..20).random()
        val stringBuilder = StringBuilder()
        repeat(n){
            stringBuilder.append(s)
        }
        return stringBuilder.toString()
    }
}