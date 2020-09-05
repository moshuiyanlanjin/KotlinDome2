package com.example.kotlindome2.KotlinTextDemo.Keyword

/**
 * companion object关键字：在类中创建伴生类，，Kotlin会保证一个类里面只有一个伴生类，其他类或函数可直接像调用静态方法调用伴生类的函数
 * 在函数上面加上@JvmStatic注解，可以将当前函数转为静态函数，但是此注解只能在单例或者Companion object中添加
 * 每个顶层方法都是静态函数
 */
class CompanionObjetcDemo{
    companion object{
        fun getString(){
            println("喝水了")
        }
        @JvmStatic
        fun getInt(){
            println("123")
        }
    }
}


fun main(){
    CompanionObjetcDemo.getString()
}