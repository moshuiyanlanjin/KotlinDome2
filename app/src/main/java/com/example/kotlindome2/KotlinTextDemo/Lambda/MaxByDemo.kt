package com.example.kotlindome2.KotlinTextDemo.Lambda

/**
 * Lambda中的maxBy，遍历集合获取最大值
 */
fun main(){
    val mutableListOf = mutableListOf("大疆", "华为荣耀")
    mutableListOf.add("小米手机")

   //最终简化代码
    val maxBy = mutableListOf.maxBy { it.length }
    println("当前集合最长的item是：${maxBy}")

    //原始写法
    val lambda = {fruit:String -> fruit.length}  //个人理解这里就是传入一段参数条件
    val maxBy1 = mutableListOf.maxBy(lambda)
    println("当前集合最长的item是：${maxBy1}")


}