package com.example.kotlindome2.Activity

import android.os.Bundle
import android.util.Log
import com.example.kotlindome2.Utils.LogUtils
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.kotlindome2.R


class ActesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d(this,"当前传入的参数是：${intent.getStringExtra("data1")},${intent.getStringExtra("data2")}")
        Log.d("","当前传入的参数是：${intent.getStringExtra("data1")},${intent.getStringExtra("data2")}")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add -> Toast.makeText(this,"增加",Toast.LENGTH_LONG).show()
            R.id.remove -> Toast.makeText(this,"删除",Toast.LENGTH_LONG).show()
        }
        return true
    }

}
