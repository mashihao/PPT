package com.example.ppt

import org.junit.Test

/**
 * @author : 马世豪
 * time : 2023/7/4 17
 * email : ma_shihao@yeah.net
 * des :
 */
class 高阶函数 {


//    let apply also with    一般只是用  let  apply


    data class Person(
        var name: String,
        var age: Int
    )


    val person = Person("Test", 123)

    @Test
    fun letTest() {

        person.let {

            //可以通过 it 获取内部的字段,  避免使用person. 来调用  用于一个object 需要高频使用, 或者通过object 展示界面使用
            println(it.name)
            println(it.age)

            println(person.name)
            println(person.age)

        }
    }


    @Test
    fun applyTest() {

        //apply  括号内部是 this  代指 当前 person 可以通过this 修改对象内部

        println("old person  $person")

        person.apply {

            this.name = "apply"
        }

        println("new person $person")
    }

}