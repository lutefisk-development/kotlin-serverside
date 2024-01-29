package org.example.loops

fun main() {
    /**
     * While
     *
     */
    var number = 5
    val brand = "Google"
    var index = 0
    while (index <= brand.length - 1) {
        println("index: ${brand[index]}")
        ++index
    }

    /**
     * DoWhile
     *
     */
    do {
        println("Hello")
    } while (false)
}