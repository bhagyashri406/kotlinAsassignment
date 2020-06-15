package com.example.asassignmentkotlin

import kotlin.collections.*

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {

    val IndexOfMax = indexOfMax(intArrayOf(3, 2, 9, 10, 11, 5, 2))
    print("IndexOfMax = $IndexOfMax")
}

fun indexOfMax(a: IntArray): Int? {
    if (a.size == 0) return null
    var index = 0
    for (i in a.indices) {
        index = if (a[i] >= a[index]) i else index
    }
    return index
}

