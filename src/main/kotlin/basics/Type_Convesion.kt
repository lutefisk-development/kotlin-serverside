package org.example.basics

fun main() {
    val num = "10"
    println(10 + num.toInt())
    // println(10.toString() + num)
    println("10$num")

    val num2 = 10
    println("$num$num2")

    val d = 3.0
    println(d)
    println(d.toInt())
}