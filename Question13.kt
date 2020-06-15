package com.example.asassignmentkotlin

import java.util.*

/**
 *12-jun-2020
 * @Bhagya Shri
 */


fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter first num ")
    var num1 = reader.nextInt();
    print("Enter second num ")
    var num2 = reader.nextInt();

    print("Enter the operator")
    var operator = reader.next();


    when (operator) {
        "+" -> sum(num1, num2)
        "-" -> difference(num1, num2)
        "*" -> multiplication(num1, num2)
        "/" -> division(num1, num2)

        else -> {
            println("Not a Operator of sum, difference, multiplication and division")
        }
    }


}

fun multiplication(num1: Int, num2: Int) {
    var multi = num1 * num2
    print("multiplication + $multi")
}


fun sum(num1: Int, num2: Int) {
    var sum = num1 + num2
    print("sum + $sum")
}

fun difference(num1: Int, num2: Int) {
    var differ = num1 - num2
    print("difference + $differ")
}

fun division(num1: Int, num2: Int) {
    var d = num1 / num2
    print("division + $d")
}