package org.example.booleans

fun main() {
    val n1 = 10
    val n2 = 20

    if (n1 > n2) {
        //println(":)")
        ":)"
    } else if (n2 == 100) {
        //println("it's over 100")
    } else {
        //println("No fish!")
        ":("
    }

    /**
     * Ternary operator
     */
    val result = if (n1 > n2) ":)" else ":("
    //println(result)


    val r =
        if (n1 > n2) ":)"
        else if (n1 == 100) ":|"
        else ":("

    println(r)
}