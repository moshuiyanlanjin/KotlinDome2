package com.example.kotlindome2.Activity

import android.os.Bundle
import com.example.kotlindome2.Data.MyDataBaseHelper
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.activity_sqlitedata.*

class SQLiteDataActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlitedata)
        val myDataBaseHelper = MyDataBaseHelper(this, "BookStore.db", 1)
        creatDatabase.setOnClickListener {
            myDataBaseHelper.writableDatabase
        }
    }
}
