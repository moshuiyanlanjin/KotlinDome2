package com.example.kotlindome2.KotlinTextDemo.Duixiang

/**
 * object,将此类声明为单例类
 */
object Singleton {
    fun singletonText(){
        println("当前是单例")
    }
}

fun main(){
     Singleton.singletonText()
}