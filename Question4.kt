package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {

    val num = 8
    var factorial: Long = 1
    for (i in 1..num) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}
