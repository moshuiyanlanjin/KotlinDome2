package com.example.kotlindome2.KotlinTextDemo

/**
 * 循环
 */

fun main(){

    one(5)
    two(6)
    three(3)

}

/**
 * 双闭合循环
 */
fun one(number:Int){
    for (i in 0..number){
        println("one循环：" + i)
    }
}

/**
 * 左闭右开的循环间隔2个数值打印
 */
fun two(number: Int){
    for (i in 0 until number step 2){
        println("two的循环：" + i)
    }
}


/**
 * 倒序循环
 */
fun three(number: Int){
    for (i in number downTo 0){
        println("three循环：" + i)
    }
}
