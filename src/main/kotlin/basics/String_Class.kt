package basics

fun main() {
    val name = "John"
    val secondName: String = "Jones"

    println(name.uppercase())
    println(name.length)
    println(name[0])
    println(secondName.lowercase())

    val age = 20

    /**
     * Old way
     */
    // var message = name + " " + age

    /**
     * String template
     */
    val message = "Name ${name.uppercase()} $secondName, Age ${age + 1}"
    println(message)

    /**
     * Multiline strings
     */
    val greeting = """
        Hello %s
            how
        are you
    """.trimIndent()

    println(greeting.format("Anna"))

    /**
     * String comparison
     *
     * == is comparing contents
     * === is comparing the memory location
     */
    val n1 = "Saleh"
    val n2 = "Jamila"

    // val n3 = "Saleh"
    val n3 = String("Saleh".toCharArray())

    // FALSE
    println(n1 == n2)
    println(n1.equals(n2))

    // TRUE
    println(n1 == n3)
    println(n1 === n3)
    println(n1.equals(n3))
}
