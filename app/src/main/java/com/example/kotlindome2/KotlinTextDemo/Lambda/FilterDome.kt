package com.example.kotlindome2.KotlinTextDemo.Lambda

fun main(){
    val mutableListOf = mutableListOf("asdas", "fdf", "adf")
    mutableListOf.add("sdddddda")

    //原始写法
    val lambda = {mu : String -> mu.length >= 5}
    val filter = mutableListOf.filter(lambda)
    for (f in filter){
        println("当前筛选到的数据为：${f}")
    }

    //简化正常写法
    val filter1 = mutableListOf.filter { it.length > 5 }
    for (f in filter1){
        println("1当前筛选到的数据为：${f}")
    }

    //结合map实现筛选并转为大写
    val map = mutableListOf.filter { it.length >= 5 }.map { it.toUpperCase() }
    for (m in map){
        println("2当前筛选到并转为大写的数据为：${m}")
    }
}