package com.example.kotlindome2.Activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kotlindome2.Fragment.AnotherRightFragment
import com.example.kotlindome2.Fragment.LeftFragment
import com.example.kotlindome2.Fragment.RightFragment
import com.example.kotlindome2.R
import kotlinx.android.synthetic.main.activity_frag.*
import kotlinx.android.synthetic.main.fragment_left.*

class FragActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_frag)

        button.setOnClickListener {
            replaceFragment(AnotherRightFragment())
        }
        replaceFragment(RightFragment())

      //  val leftFragment = supportFragmentManager.findFragmentById(R.id.leftFrag) as LeftFragment
        //简化写法
        val leftFragment = leftFrag as LeftFragment
        leftFragment.setDate()

    }

    private fun replaceFragment(fragment: Fragment) {
        //获取fragmentManger
        val supportFragmentManager = supportFragmentManager
        //通过beginTransaction开启一个事务
        val beginTransaction = supportFragmentManager.beginTransaction()
        //通过replace添加或者替换fragment
        beginTransaction.replace(R.id.rightLayout,fragment)
        //将一个事务添加到返回栈中
        beginTransaction.addToBackStack(null)
        //提交事务
        beginTransaction.commit()
    }

}
