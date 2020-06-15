package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {
    val str = "BASAB"
    val sum = isPalindrome(str)
    println("isPalindrome = $sum")
}


fun isPalindrome(string: String): Boolean {
    val testString = string.toLowerCase()
        .replace("""[\W+]""".toRegex(), "")
    return testString == testString.reversed()
}
