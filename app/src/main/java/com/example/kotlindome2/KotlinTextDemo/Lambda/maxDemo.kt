package com.example.kotlindome2.KotlinTextDemo.Lambda

/**
 * max将集合中的每个元素都映射为其他元素
 */
fun main(){
    val mutableListOf = mutableListOf("a", "b", "c")
    mutableListOf.add("d")
    //原始写法
    val lambda = {fulit:String -> fulit.toUpperCase()}
    val map = mutableListOf.map(lambda)
    for (m in map){
        println("转换后的值为：${m}")
    }
    //简化写法
    val map1 = mutableListOf.map { it.toUpperCase() }
    for (m in map1){
        println("1转换后的值为：${m}")
    }

}