package com.example.ppt

import org.junit.Test

/**
 * @author : 马世豪
 * time : 2023/7/4 17
 * email : ma_shihao@yeah.net
 * des :
 */
class 空处理 {


    //    A?:B  ?:的意思是A如果未null  name B 替代A的位置
    @Test
    fun IntTest() {
        var age: Int? = null
        if (age == 1) {

        }
        println(age) // 打印出来 null
        println(age ?: 1)  //打印出来  1     A?:B  ?:的意思是A如果未null  name B 替代A的位置
    }

    @Test
    fun BooleanTest() {
        var flag: Boolean? = null

        //因为  flag 可能未null 所以 flag 先是 null  再是boolean 值 需要==true 来判断
        if (flag == true) {

        }
        //当然也可以通过 ?: 来替换默认值
        if (flag?:false) {

        }
        println(flag) // 打印出来 null
        println(flag ?: 1)  //打印出来  1     A?:B  ?:的意思是A如果未null  name B 替代A的位置
    }

}