package org.example.arrays_lists

fun main() {
    val names = listOf(
        "Tom",
        "Ben",
        "Julie",
        "Maxine"
    )

    val (one,two, _, four) = names
    println("name one: $one, name two: $two, name four: $four")
}