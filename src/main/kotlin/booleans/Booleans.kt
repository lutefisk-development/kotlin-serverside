package org.example.booleans

fun main() {

    /**
     * When booleans can be null.
     * You have to specifically check if the value is true!!
     */

    val isAdult: Boolean? = true

    if (isAdult == true) {
        println("NOT null AND true")
    } else {
        println("false OR null")
    }

}