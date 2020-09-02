package com.example.kotlindome2.KotlinTextDemo.Lambda

/**
 * any:判断当前集合是否有元素满足条件，all：判断当前集合是否所有元素都满足条件
 *
 */
fun main(){
    val listOf = listOf("cc", "cd", "yde", "cjidcv")

    //原始写法
    val lamba = {f : String -> f.length>3}
    val any = listOf.any(lamba)
    println("当前any判断的值为${any}")
    val alllamba = {f:String -> f.length > 3}
    val all = listOf.all(alllamba)
    println("当前all判断的值为${all}")



    //精简写法
    val any1 = listOf.any { it.length > 3 }
    val all1 = listOf.all { it.length > 3 }
    println("当前any1判断的值为${any1},当前all1判断的值为${all1}")

}