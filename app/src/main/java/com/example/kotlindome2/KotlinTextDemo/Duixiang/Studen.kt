package com.example.kotlindome2.KotlinTextDemo.Duixiang


/**
 * 子类，因为父类中已经声明name和age的的属性，如果子类再次声明var或者val会和父类造成冲突
 */
class Studen(var sno:String,var grade:Int,name:String,age:Int):Person(name,age) {
    init {
        println("学号：" + sno)
        println("年级：" + grade)
    }

    /**
     * constructor：次级函数关键字，kotlin规定次级函数必须调用主构造函数（也可间接调用）,一个类只有一个主钩造函数，但可以有多个次级函数
     */
    constructor(name: String,age: Int):this("30",6,name,age){
        println("当前次级函数是：${name},${age},${sno},${grade}")
    }

    constructor():this("老刘",33){
        println("当前最低次级函数是：${name},${age},${sno},${grade}")
    }
}


fun main(){
    val s = Studen("20",2,"李四",21)
    Studen("王五",20)
    Studen()
}