package org.example.arrays_lists

fun main() {
    /**
     * Arrays
     */

    // This type of array can not be expanded or reduced
    val names = arrayOf("Tom", "Ben")

    names[0] = "Luke"

    println(names[1])
    println(names.contentToString())
    println(names.size)

    if ("Tom" in names) {
        println("FOUND")
    } else {
        println("NOT FOUND")
    }

    val arrayOfNulls = arrayOfNulls<String>(5)

    arrayOfNulls.fill("***")

    arrayOfNulls[3] = "Hello"
    println(arrayOfNulls.contentToString())
}