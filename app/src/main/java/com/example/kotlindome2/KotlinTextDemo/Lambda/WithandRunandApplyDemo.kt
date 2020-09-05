package com.example.kotlindome2.KotlinTextDemo.Lambda

/**
 * with、run、apply个人感觉和let十分相似，都是接受一个lambda函数，并且会在lambda中调用上下文
 * 区别1：with可直接调用，run和apply必须调用某个对象的run或apply才行
 * 区别2：with和run可直接返回指定类型，apply则只能返回对象本身
 *
 */

fun main(){
    yuanshi()

    withDemo()

    runDome()

    applyDemo()
}

fun applyDemo() {
    val list = listOf("aaa","vvv","sdsd","dddd")
    val str = StringBuilder().apply {
        append("333\n")
        for (str in list){
            append(str).append("\n")
        }
        append("444")

    }
    println(str.toString())
}

fun runDome() {
    val list = listOf("aaa","vvv","sdsd","dddd")
    val str = StringBuilder().run {
        append("111\n")
        for (str in list){
            append(str).append("\n")
        }
        append("222")
        toString()

    }

    println(str)
}

fun withDemo() {
    val list = listOf("aaa","vvv","sdsd","dddd")
    val str = with(StringBuilder()){
        append("sd")
        for (str in list){
            append(str).append("\n")
        }
        append("ppp")
        toString()
    }
    println(str)

}

fun yuanshi() {

    val list = listOf("aaa","vvv","sdsd","dddd")
    val builder = StringBuilder()
    builder.append("sder\n")
    for (str in list){
        builder.append(str).append("\n")
    }
    builder.append("okn")
    val str = builder.toString()
    println(str)
}
