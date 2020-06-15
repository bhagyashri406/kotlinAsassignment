package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {
    val row = 2
    val column = 3
    val matrix = arrayOf(intArrayOf(1, 7, 8), intArrayOf(3, 2, 9))

    // Display current matrix
    display(matrix)

    // Transpose the matrix
    val transpose = Array(column) { IntArray(row) }
    for (i in 0..row - 1) {
        for (j in 0..column - 1) {
            transpose[j][i] = matrix[i][j]
        }
    }

    // Display transposed matrix
    display(transpose)
}

fun display(matrix: Array<IntArray>) {
    println("The matrix is: ")
    for (row in matrix) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}