package com.example.kotlindome2.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlindome2.R
import com.example.kotlindome2.Utils.LogUtils

class LeftFragment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_left,container,false)
    }

    fun setDate() = activity?.let { LogUtils.d(it,"打印了") }
}