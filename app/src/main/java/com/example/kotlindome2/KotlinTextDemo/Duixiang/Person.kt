package com.example.kotlindome2.KotlinTextDemo.Duixiang

/**
 * 父类
 */
open class Person(var name:String,var age:Int){


    fun eat(){
        println("打印${name}年龄$age")
    }
}

fun main(){
    val p = Person("张三",21)

    p.eat()
}