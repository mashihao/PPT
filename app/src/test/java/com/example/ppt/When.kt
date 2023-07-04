package com.example.ppt

import org.junit.Test

/**
 * @author : 马世豪
 * time : 2023/7/4 17
 * email : ma_shihao@yeah.net
 * des :
 */
class When {


    // when 类似 java 的 switch  case  但是可以作为返回来使用

    @Test
    fun test() {


        val name = "123"
        when (name) {
            "123" -> {}
            "234" -> {}
            "145" -> {}
        }


        println(returnWhen(3))
    }


    fun returnWhen(key: Int) =
        when (key) {
            1 -> "1"
            2 -> "2"
            3 -> "3"
            4 -> "4"
            else -> {
                "else"
            }
        }


}