package com.example.kotlindome2.KotlinTextDemo.Duixiang

/**
 * 数据类，data关键字直接声明，不在需要get/set/tostring
 */
data class Cellphone(val brand:String,val price :String)

fun main(){
    val cellphone = Cellphone("仓基", "2000")
    val cellphone1 = Cellphone("公子", "3202")
    println(cellphone.toString() + ",${cellphone1},当前的两个对象是否相等呢？=${cellphone == cellphone1}")


}