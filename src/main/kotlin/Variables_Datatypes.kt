package org.example

const val PI = 3.14

fun main() {
    /**
     * To declare a variable use the keywords:
     * var
     * val
     */
    var name: String = "Klaravik"
    var age: Int = 12

    //println(name)
    //println(age)
    println("name: ${name} - age: ${age}")


    /**
     * Datatypes:
     */
    var n: Int     = 55
    var l: Long    = 100L
    var d: Double  = 3.14
    var f: Float   = 3.14F
    var b: Boolean = true
    var s: String  = "Yeay"
    var c: Char    = 'A'


    /**
     * Any type
     * Can hold all datatypes
     */
    var number2: Any = 10
    var name2: Any = "Hello"


    /**
     * Type Inference means that Kotlin will determine the type.
     * We don't actually have to explicitly define the type
     */
    var name3 = "Some Name"
    var number3 = 123


    /**
     * val Keyword
     */
    // var keyword is mutable
    var brandVar = "Google"
    brandVar = "Tesla"

    // val keyword is immutable
    val brandVal = "Toyota"

    // Will get error here: "Val cannot be reassigned"
    //brandVal = "BMW"


    /**
     * const keyword
     *
     * will NEVEER change. Must be declared outside functions
     * The value is known before code execution!
     */

}