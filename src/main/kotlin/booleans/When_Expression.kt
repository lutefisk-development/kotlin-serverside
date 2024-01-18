package org.example.booleans

fun main() {
    val input = "F"

    val gender = when(input) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> "NON BINARY"
    }

    //println(gender)


    val n1 = 300
    val n2 = 400
    val goFish = when {
        (n1 > n2 || n1 <= 80) -> ":)"
        (n1 == 100) -> "Foo"
        (n1 == 200) -> "Bar"
        else -> "No Fish"
    }

    //println(goFish)


    val age = 12
    when (age) {
        in 13..19 -> println("Teenager")
        in 0..12 -> println("Child")
        else -> println("Adult")
    }
}