package com.example.ppt

import org.junit.Test

/**
 * @author : 马世豪
 * time : 2023/7/4 17
 * email : ma_shihao@yeah.net
 * des :
 */
class 三元运算符 {


    // java  三元运算符   flag?"true":"false"
    // kotlin 没有 三元运算符   只有 if else

    @Test
    fun test() {

        val flag = false
        println(if (flag) "正确" else "错误")

    }

}