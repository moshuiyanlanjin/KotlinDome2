package com.example.kotlindome2.KotlinTextDemo

import com.example.kotlindome2.KotlinTextDemo.KuoZhan.lettersCount
import com.example.kotlindome2.KotlinTextDemo.KuoZhan.times

fun main(){
    pd(5,4)
    println("cdfsdd84s5g3g".lettersCount())
    println("abd" * 3)
}

fun pd(i: Int, i1: Int) {
    if (i<=5 && i1<4){
        println("当前小于")
    }else if(i>=5 && i1>=4){
        println("当前大于")
    }


}
