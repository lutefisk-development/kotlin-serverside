package basics

fun main() {
    var name = "Tony"
    println(name.uppercase())

    /**
     * Define the type and add a questionmark. The variable can be of the type OR null
     */
    var brand: String? = "Volvo"
    println(brand?.uppercase())
}