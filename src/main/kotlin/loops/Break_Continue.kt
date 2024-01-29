package org.example.loops

fun main() {
    val nums = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
    for (n in nums) {

        /*
        if (n == 2) {
            continue;
        }
         */

        if (n % 2 != 0) continue

        if (n > 7) break

        println(n)
    }

    // Will not work in a foreach
    nums.forEach {
        // if (it == 2) continue
    }

}