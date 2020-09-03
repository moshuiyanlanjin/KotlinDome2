package com.example.kotlindome2.KotlinTextDemo.JiQiao

/**
 * 函数的应用技巧
 */
fun main(){
    //因函数中str已经有默认值，所以在可以可以只传入unm的值
    printParams(123)
    //如果传入str值，则会覆盖掉本身的默认值
    printParams(123,"sss")

    //如果第一个参数默认，这种情况下printParames（"龙"）会报错，需要给告诉传入值的key值，此方法可多用于代替次级函数
    printParames(str = "龙")
}

fun printParams(unm :Int,str:String = "hello"){
    println("num:$unm,str:$str" )
}

fun printParames(num:Int = 100,str:String){
    println("num:$num,str:$str")
}