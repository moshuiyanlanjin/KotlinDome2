package com.zhongyagroup.kotlindome.DomeText

import android.icu.text.CaseMap

/**
 * 关于when的demo，when是java中switch的替换，比switch的功能更加强大，可以判断传入数据的类型和根基需求拿到不同条件的值
 */


fun main(){
    println(getScore("张三"))
    println(checkNumber(20))
    println(getNumber("李四"))
}

fun getScore(name:String) = when(name){
    "张三" -> 87
    "李四" -> "不及格"
    else -> ""
}

fun checkNumber(number: Number) = when(number){
    is Int -> "这是Int类型"
    is Float -> "这是Float类型"
    else -> ""
}

fun getNumber(string: String) = when{
    string == "李四" -> 87
    string.startsWith("张") -> "不及格"
    else -> ""
}