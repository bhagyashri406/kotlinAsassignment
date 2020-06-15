package com.example.asassignmentkotlin

import java.util.Scanner;

/**
 *12-jun-2020
 * @Bhagya Shri
 */


fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter the month number:")
    var monthOfYear = reader.nextInt()
    var month = when (monthOfYear) {
        1 -> "January"
        2 -> "Febuary"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> {
            println("Not a month of year")
        }
    }
    println(month)
}


