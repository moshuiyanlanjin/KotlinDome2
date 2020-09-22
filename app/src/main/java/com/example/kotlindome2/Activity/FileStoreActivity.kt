package com.example.kotlindome2.Activity

import android.content.Context
import android.os.Bundle
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.activity_filestore.*
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.lang.StringBuilder

class FileStoreActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filestore)
        if(load().isNotEmpty()){
            edit.setText(load())
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        save(edit.text.toString())
    }

    private fun save(inputText:String){
        val output = openFileOutput("乌鸡", Context.MODE_PRIVATE)
        val writer = BufferedWriter(OutputStreamWriter(output))
        writer.use {
            it.write(inputText)
        }
    }

    private fun load():String{
        val context = StringBuilder()
        try {
            val input = openFileInput("乌鸡")
            val reader = BufferedReader(InputStreamReader(input))
            reader.use {
                reader.forEachLine {
                    context.append(it)
                }
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
        return context.toString()
    }
}
