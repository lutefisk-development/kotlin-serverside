package org.example.booleans

fun main() {

    /**
     * Three possible values for booleans
     *
     * try to ask question, naming conversion
     */

    val isAdult = true // || false
    val isMale = false
    println(isAdult && isMale)
    println(isAdult || isMale)
    println(!isMale)

    val isOrderCompleted: Boolean? = null
    println(isOrderCompleted)


    /**
     * Comparison
     */
    val n1 = 10
    val n2 = 20

    // val res = n1 > n2
    // val res = n1 >= n2
    // val res = n1 < n2
    val res = n1 <= n2
    println(res)
}