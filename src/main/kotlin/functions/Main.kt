package org.example.functions

fun main() {
    //greet("John", 25)
    //greet("Michelle", 13)

    println("---------------")

    // Named arguments:
    //greet(age=23, name="Freddy")

    // Default arguments:
    //greet("Tom")

    println("---------------")
    //functionAsArguments()

    println("---------------")
    //println(double(12))

    println("---------------")
    
    /**
     * Destructoring
     */
    val (v1, v2) = twoValues()
    val (t1,t2,t3) = threeValues()
    //println("Values one is $v1. And value two is $v2")
    //println("Values one is $t1. Value two is $t2. And value thee is $t3")

    println("---------------")
}

fun twoValues(): Pair<String, Int> =
    "Hello" to 10
    // Pair("Hello", 10)

//fun twoValues(): Pair<String, Int> {
//    /**
//     * Some validation, or other relevant code
//     */
//
//    return "Hello" to 30
//}

fun threeValues(): Triple<String, Int, Char> {
    return Triple("Hello", 10,  'F')
}

fun double(n: Int): Int = n * 2

//fun double(n: Int): Int {
//    return n * 2
//}

fun functionAsArguments() {
    // Function as argument
    foo(bar = {
        println("bar as a function")
    })
    foo(bar = {
        println("baz baz...")
    })
}

fun foo(bar: () -> Unit = {}) {
    println("bar function")
    bar()
}

fun greet(name: String, age: Int = -1) {
    println("Hello $name 👋")

    if (age == -1) {
        println("Age is not provided")
        return
    }

    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is a child")
    }

}