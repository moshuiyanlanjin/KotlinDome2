package com.example.kotlindome2.KotlinTextDemo.JieKou

import com.example.kotlindome2.KotlinTextDemo.Duixiang.Person

class Studens(name:String,age:Int) : Person(name,age),Study{
    override fun doHomework() {
        println("doHomework:${name},${age}")
    }

    override fun readBooks() {
        super.readBooks()
        println("readBooks:${name},${age}")
    }
}

fun main(){
    val studens = Studens("乌鸡", 22)
    studens.doHomework()
    studens.readBooks()



}