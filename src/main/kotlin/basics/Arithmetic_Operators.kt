package basics
import kotlin.math.*

fun main() {

    val number1 = 10
    val number2 = 3

    println("addition ${number1 + number2}")
    println("subtraction ${number1 - number2}")
    println("multiplication ${number1 * number2}")
    println("division ${number1 / number2}")
    println("modulus ${number1 % number2}")


    /**
     * Math package
     */
    println(PI)
    println(max(number1, number2))
    println(min(10, 3))
    println(sqrt(5.0))
    println(round(4.5))


    /**
     * ++ and -- operator
     */
    var num = 10

    // increment and return:
    println(++num) // --num

    // return and then increment:
    println(num++) // num--

    // value
    println(num)
}