package com.example.kotlindome2.KotlinTextDemo.Gaoji

import java.lang.StringBuilder

/**
 * 高级函数：可直接传入函数，完整规则是在前方加入classname,仿apply写法
 * 内联函数：在fun前方添加inline，主要作用是抵消Lambda表达式带来的运行开销
 * noinline:强调此函数无需内联
 * crossinline:确定此内联函数一定不会使用return
 */

inline fun num1AndNum2(num1:Int,num2:Int,operatin:(Int,Int) -> Int):Int{
    val result = operatin(num1,num2)
    return result
}


fun plus(num1:Int,num2:Int):Int{
    return num1 + num2
}

fun minus(num1: Int,num2: Int):Int = num1 - num2

/**
 * 定义高级函数的完整规则，在函数类型前面加上classname,就表示这个函数是定义在那个类中，此高级函数是模仿apply的实现方式，只不过apply可用于所有的类，但是定义的build只能
 * 用于StringBuilder类上面
 */
fun StringBuilder.build(bolck : StringBuilder.() -> Unit) : StringBuilder{
    bolck()
    return this
}

fun main(){
    val num1 = 100
    val num2 = 80
    //::plus中的::是一种引入式写法，意思是将plus()作为参数传入
   val result1 =  num1AndNum2(num1,num2,::plus)
    val result2 = num1AndNum2(num1,num2,::minus)
    //将上方两个高级函数用Labda表达式写
    val result3 = num1AndNum2(num1,num2){n1,n2 ->n1 + n2}
    val result4 = num1AndNum2(num1,num2){m1,m2 -> m1 - m2}
    println("result1的结果是：$result1")
    println("result2的结果是：$result2")
    println("result3的结果是：$result3")
    println("result4的结果是：$result4")


    val list = listOf("但是","非常","路径","☀")
    val resule5 = StringBuilder().build {
        append("地方\n")
        for (l in list){
            append(l).append("\n")
        }
        append("阿斯蒂芬\n")
    }

    println("resultt5的结果是:$resule5")

}