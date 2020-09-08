package com.example.kotlindome2.Bean

/**
 * const:定义常量，只有在单例、companion object、顶层函数中才能使用
 */
class Msg (val content:String,val type :Int){
    companion object{
        const val TYOPE_RECEIVED = 0
        const val TYPE_SEMT = 1
    }
}