package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {
    val num1 = 35
    val num2 = 120
    var lcm: Int

    // maximum number between n1 and n2
    lcm = if (num1 > num2) num1 else num2

    // Always true
    while (true) {
        if (lcm % num1 == 0 && lcm % num2 == 0) {
            println("The LCM of $num1 and $num2 is $lcm.")
            break
        }
        ++lcm
    }
}
