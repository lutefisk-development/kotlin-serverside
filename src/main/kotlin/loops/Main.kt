package org.example.loops

fun main() {
    val names = listOf("lisa","john","tim")
    val numbers = intArrayOf(1,2,3,4)

    for (name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    println("---------------")

    for (n in numbers) println(n)

    println("---------------")

    val charArray = charArrayOf('A', 'B', 'C', 'D', 'E')
    for (index in charArray.indices) {
        println("$index - ${charArray[index]}")
    }
    println("Reverse: ")
    for (index in charArray.indices.reversed()) {
        println("$index - ${charArray[index]}")
    }

    println("---------------")

    for (i in 1..5) {
        println(i)
    }
    println("---------------")
    for (i in 1..5 step 2) {
        println(i)
    }
    println("---------------")
    for (i in 5 downTo 1) {
        println(i)
    }

    println("---------------")

    val brand = "Google"

    for (letter in brand) println(letter)
}