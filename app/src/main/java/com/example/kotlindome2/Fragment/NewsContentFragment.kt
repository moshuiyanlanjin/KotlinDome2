package com.example.kotlindome2.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.frag_news_content.*

class NewsContentFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_news_content,container,false)
    }

    fun refresh(title:String,content:String){
        contentLayout.visibility = View.VISIBLE
        newsTitle.text = title//刷新新闻的标题
        newsContent.text = content//刷新新闻内容
    }
}