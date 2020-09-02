package com.example.kotlindome2.KotlinTextDemo.Lambda

/**
 * 集合事例
 */

fun main(){
    //listof生成的集合为不可变集合
  val list = listOf("儒教","道教","佛教")
    for (str in list){
        println(str)
    }
    //mutableListOf生成的集合为可变集合
    val mutableListOf = mutableListOf("一日", "十日", "百日", "千日")
    mutableListOf.add("万日")
    for (str in mutableListOf){
        println(str)
    }

    //和listof用法一样
    val of = setOf("天仙", "神仙", "地仙")
    for (str in of){
        println(str)
    }

    //和mutableListOf用法一样
    val mutableSetOf = mutableSetOf("东华", "纯阳", "吕祖")
    mutableSetOf.add("剑仙")
    for (str in mutableSetOf){
        println(str)
    }

    //map集合具体用法和listof一样，在这里添加了to关键字 用来关联
    val mapOf = mapOf("儒" to "四书五经", "道" to "道德经")
    for((jiao,jing) in mapOf){
        println("教派：${jiao},经典著作：${jing}")
    }


}