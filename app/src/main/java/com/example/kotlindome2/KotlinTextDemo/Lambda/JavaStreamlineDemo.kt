package com.example.kotlindome2.KotlinTextDemo.Lambda

/**
 * 对java代码精简实例：以开启异步线程方法为实例
 */
fun main() {
    /**
     * java写法
     *  new Thread(new Runnable() {
     * @Override
     * public void run() {
     * System.out.println("当前为子线程");
     * }
     * }).start();
     */
    //原始kotlin写法，因为kotlin中舍弃了new将其改为object关键字
    Thread(object :Runnable{
        override fun run() {
            println("当前为子线程")
        }
    }).start()

    //按照kotlin规则，可去掉object关键字，可改为
    Thread(Runnable { println("当前为子线程")  }).start()


    //按照规则当前参数列表只有一个接口时，可精简为
    Thread{ println("当前为子线程")}.start()
}