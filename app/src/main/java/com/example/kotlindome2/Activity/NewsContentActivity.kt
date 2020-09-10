package com.example.kotlindome2.Activity

import android.os.Bundle
import com.example.kotlindome2.Fragment.NewsContentFragment
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.activity_news_content.*

class NewsContentActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)
        val title = intent.getStringExtra("news_title")
        val content = intent.getStringExtra("news_content")
        if (title != null && content != null) {
                val fragment = newsContentFrag as NewsContentFragment
                fragment.refresh(title,content)

        }
    }
}