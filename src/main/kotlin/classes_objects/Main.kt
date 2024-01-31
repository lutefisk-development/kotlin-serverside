package org.example.classes_objects

fun main() {

    /**
     * Instantiate an object
     */
    val tv = SmartDevice(
        "Samsung Oled",
        73.99
    )
    //tv.brand = "Samsung Oled"
    //tv.price = 73.99

    val phone = SmartDevice("iPhone 14")
//    phone.brand = "iPhone 14"
//    phone.price = 108.99

    //println("${tv.brand}, ${tv.price}")

    //tv.getState()
    //tv.turnOn()
    //tv.getState()
    //tv.turnOff()

    println("-------------")



    val laptop = SmartDevice(
        "Apple MacBook Pro M1",
        2099.99
    )

    val laptopTwo = SmartDevice(
        "Apple MacBook Pro M1",
        2099.99
    )

//    val laptopTwo = laptop

    /**
     * When using == it refers to whether the variables use the same place in memory
     * When using === it refers to check
     */
    println("== ${laptop == laptopTwo}")
    println("=== ${laptop === laptopTwo}")

    //println(laptop)
}

/**
 * Blueprint
 */
class SmartDevice (
    var brand: String? = null,
    var price: Double? = null,
    var isSwitchedOn: Boolean? = false
) {

    constructor() : this(null, null)
    constructor(brand: String) : this(brand, 0.0)

    /**
     * properties
     */
    //var brand = brand

        /**
         * Getters and Setter are really not needed, unless you want to do some actual manipulation of the data
         */
//        get() = field
//        set(value) {
//            field = value.uppercase()
//        }


    //var price = price
    //var isSwitchedOn = isSwitchedOn


    /**
     * methods (functions)
     */
    fun getState() = println("$brand is on: $isSwitchedOn")

    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

//    override fun toString(): String {
//        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
//    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }


//    override fun hashCode(): Int {
//        var result = brand?.hashCode() ?: 0
//        result = 31 * result + (price?.hashCode() ?: 0)
//        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
//        return result
//    }



    fun test(foo: Int) : String = "Hello ${foo.toString()}"

}