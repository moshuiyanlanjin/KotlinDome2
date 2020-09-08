package com.example.kotlindome2.KotlinTextDemo.Keyword

import java.lang.Exception

/**
 * sealed class:密封类,类似于接口，当when传入一个密封类变量作为条件时，kotlin会自动检测密封类有多少子类，并强制要求将每一个子类都处理，所以可以不用else
 * 而传入接口不强制，所以要加else
 */

sealed class Result

class Success(val msg:String):Result()

class Failure(val error:Exception) :Result()

fun main(){
    println(getResultMsg(Success("正确")))
}

/**
 *
 */
fun getResultMsg(result: Result) = when (result){
    is Success -> result.msg
    is Failure -> result.error.message
    else -> throw IllegalAccessError()
}