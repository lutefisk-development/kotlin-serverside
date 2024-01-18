package org.example.arrays_lists

fun main() {
    val namesList: List<String> = listOf(
        "Ben",
        "Luke",
        "Tom"
    )

    //println(namesList[0])
    //println(namesList.size)
    //println(namesList.contains("Fred"))
    //println(namesList.first())
    //println(namesList.last())
    //println(namesList.indexOf("Luke"))
    // println(namesList)


    val namesListTwo = mutableListOf(
        "Jake",
        "Tim",
        "Jane"
    )

    println(namesListTwo[0])
    println(namesListTwo.size)
    println(namesListTwo.contains("Fred"))
    println(namesListTwo.first())
    println(namesListTwo.last())
    println(namesListTwo.indexOf("Tim"))
    namesListTwo.remove("Jake")
    namesListTwo.add(2,"Johnny")
    println(namesListTwo)

    val emptyList = mutableListOf<Any>()

    emptyList.add("Foo")
    emptyList.add(1337)

    val msg = if (emptyList.isEmpty()) "Yes, it is empty" else "No the list has ${emptyList.size} indexes"

    println(msg)
}