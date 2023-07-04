package com.example.ppt

import org.junit.Test

/**
 * @author : 马世豪
 * time : 2023/7/4 17
 * email : ma_shihao@yeah.net
 * des :
 */


// data class 不需要写 get set 方法  不需要写  构造函数
data class Person(
    var name: String,
    var age: Int
)


// data class 如果 字段 声明值, 构造函数可以省略 当前字段
data class Person2(
    var name: String = "msh",
    var age: Int
)

class DataClass {
    @Test
    fun test() {

        val person = Person("123", 123)
        person.name = "345"
        person.age = 345
        println(person)


        //此处省略了  name
        val person2 = Person2(age = 123)
        person2.age = 345

        println(person2)


    }
}