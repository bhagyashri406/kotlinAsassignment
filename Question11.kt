package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */


fun main(args: Array<String>) {

    val numRuns = runs(intArrayOf(1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0))
    print("numRuns = $numRuns")
}

fun runs(a: IntArray): Int {
    if (a.isEmpty()) return 0;
    var numRuns = 0
    var previousNumber: Int? = null
    for (value in a) {
        if (previousNumber == null || value != previousNumber) {
            previousNumber = value
            numRuns++
        }
    }
    return numRuns
}