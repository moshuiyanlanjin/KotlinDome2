package com.example.kotlindome2.KotlinTextDemo.Lambda

import com.example.kotlindome2.KotlinTextDemo.JieKou.Study


fun main(){

}
//let的具体使用
fun doStudy(study: Study?){

    //原始写法：
    study?.doHomework()
    study?.readBooks()
    //如果将之翻译为if语句则为下方示例,比较繁琐
    if(study != null){
        study.readBooks()
    }
    if(study != null){
        study.doHomework()
    }
    //在此可以引用let和？.对之进行优化，let将对象传入Lambda表达式中，此时的对象肯定不为空，所以就可以这么写
    study?.let { study ->
        study.doHomework()
        study.readBooks()
    }
    //Lambda中规定，当参数列表只有一个参数时则不用声明参数，用it关键字代替
    study?.let {
        it.doHomework()
        it.readBooks()
    }
}