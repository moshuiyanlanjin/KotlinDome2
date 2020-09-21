package com.example.kotlindome2.Utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.kotlindome2.Activity.*

/**
 * companion object：所有companion object中的方法都可以类似静态变量调用
 */
class StartActivity {
    companion object{

        /**
         * 跳转ActseActivity及Activity界面
         */
        fun StartActesActivity(context: Context,data1:String,data2:String){
            val intent = Intent(context,ActesActivity::class.java)
            intent.putExtra("data1",data1)
            intent.putExtra("data2",data2)
            context.startActivity(intent)
        }

        /**
         * 跳转RecycleViewActivity
         */
        fun StratRecycleViewActivity(context: Context){
            val intent = Intent(context, RecycleViewActivity::class.java)
            context.startActivity(intent)
        }
        /**
         * 跳转FragActivity中
         */
        fun StartFragActivity(context: Context){
            val intent = Intent(context, FragActivity::class.java)
            context.startActivity(intent)
        }

        /**
         * 跳转到瀑布流的Activity界面
         */
        fun StartWaterfallActivity(context: Context){
            val intent = Intent(context, WaterfallActivity::class.java)
            context.startActivity(intent)
        }

        /**
         * 跳转聊天界面
         */
        fun StartChatRecyActivity(context: Context){
            val intent = Intent(context, ChatRecyActivity::class.java)
            context.startActivity(intent)
        }

        /**
         * 跳转到新闻内容界面
         */
        fun StartNewsContentActivity(context: Context,title:String,content:String){
            val intent = Intent(context,NewsContentActivity::class.java).apply {
                putExtra("news_title",title)
                putExtra("news_content",content)
            }
            context.startActivity(intent)
        }

        /**
         * 跳转到新闻activity
         */
        fun StartNewsTitleActivity(context: Context){
            val intent = Intent(context,NewsTitleActivity::class.java)
            context.startActivity(intent)
        }

        /**
         * 跳转到广播activity
         */
        fun StartBroadcastActivity(context: Context){
            val intent = Intent(context, BroadcastActivity::class.java)
            context.startActivity(intent)
        }

        fun StartFileStoreActivity(context: Context){
            val intent = Intent(context, FileStoreActivity::class.java)
            context.startActivity(intent)
        }
    }
}