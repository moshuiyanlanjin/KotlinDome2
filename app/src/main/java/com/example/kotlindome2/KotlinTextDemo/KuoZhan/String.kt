package com.example.kotlindome2.KotlinTextDemo.KuoZhan

import java.lang.StringBuilder

/**
 * String扩展函数
 */

//获取当前String中有多少字母
fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }
    }
    return count
}

//字符串重复添加
operator fun String.times(n: Int): String {
    val stringBuilder = StringBuilder()
    repeat(n) {

        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}