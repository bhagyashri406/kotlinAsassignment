package com.example.asassignmentkotlin.Question23

import kotlin.String

/**
 *12-jun-2020
 * @Bhagya Shri
 */


data class Players(
    val runs: Int,
    val age: Int,
    val nom: Boolean,
    val name: String,
    val player_number: Int
)

// A function returning values
fun sendData(): Players {
    return Players(56, 32, true, "MS Dhoni", 223)
}

fun main() {

    // a) Write a function to return all members values for the given player_number

    val map = mutableMapOf<Int, Players>()
    map.put(123, Players(22, 21, false, "Hardik", 123))
    map.put(112, Players(50, 25, true, "Sachin", 112))
    map.put(111, Players(31, 23, true, "Mohit", 111))
    map.put(114, Players(31, 23, true, "Sharad", 114))
    map.put(117, Players(38, 40, false, "Pushkar", 117))

    println("Print All List with key value pair")
    println(map)
    println("")
    val newmap = map.get(114)
    println("Print All values of player_number 114")
    println(newmap)
    println("")


    //b) Write a program to destructure the return value of the function and print the
    //individual values

    val (runs, age, nom, name, player_number) = sendData()
    println("Name is $name")
    println("Age is $age")
    println("player_number is $player_number")
    println("nom is $nom")
    println("runs is $runs")

}





