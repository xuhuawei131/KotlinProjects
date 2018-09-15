package com.xuhuawei.kotlin

class Complex (var real:Double,var imageinary:Double){
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imageinary+other.imageinary)
    }

    override fun toString(): String {
        return "Complex(real=$real, imageinary=$imageinary)"
    }
    operator fun invoke():Double{
        return Math.hypot(real,imageinary)
    }
}
fun main(args:Array<String>){
        var one=Complex(1.0,2.0)
        var two=Complex(3.0,4.0)
        var three=one+two
        println(three)
    println(one())//调用invoke方法
}