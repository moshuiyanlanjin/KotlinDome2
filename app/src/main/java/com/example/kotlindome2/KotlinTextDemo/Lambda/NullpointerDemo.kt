package com.example.kotlindome2.KotlinTextDemo.Lambda

import com.example.kotlindome2.KotlinTextDemo.JieKou.Study

var content:String? = "hello"

/**
 * 空指针在kotlin中的限制，处理与跳过的演示,具体操作符分别有：？.，？：，和！！.
 */
fun main(){
    //kotlin会检测当前传入参数是否为空，如果为空则直接在代码中报错提示
    //dostudy(null)
    getTextLength("sss")
    getTextLengths(null)
    if (content != null){
        printUpperCase()
    }
}
//如果当前传入参数的类型后面加上？则表示可以传入的参数为空
fun dostudy(study: Study?){
    study?.readBooks()
    study?.doHomework()
}

//?:的使用
fun judge(){
    val a = ""
    val b = "1"
    var c = if (a != null) {
        a
    }else{
        b
    }

    //用?：可以这样写
    val c1 = a ?: b           //释义：a如果为null则返回b

}
//?.和?:结合使用，例：
//原始写法
fun getTextLength(text:String?) : Int{
    if (text != null){
        return text.length
    }
    return 0
}

//用？.和？：可以精简 为
fun getTextLengths(text:String?) = text?.length ?: 0                //释义：因为传入的text可以为空，所以需要添加?.,如果text为null我们可以借助 ？： 返回0

//!!.告诉kotlin我非常确定content不为空（有风险）
fun printUpperCase(){
    //var upperCase = content.toUpperCase()
    var upperCase = content!!.toUpperCase()
    println(upperCase)
}