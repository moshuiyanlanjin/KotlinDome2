package com.example.kotlindome2.KotlinTextDemo.ChongZai

class Money (val value:Int){
    operator fun plus(money: Money):Money{
        val sum = value + money.value
        return Money(sum)
    }

    operator fun plus(newInt:Int):Money{
        val sum = value + newInt
        return Money(sum)
    }
}


fun main(){
    val maney1 = Money(5)
    val maney2 = Money(7)
    val money3 = maney1 + maney2
    println(money3.value)
    val money = money3 + 7
    println(money.value)
}