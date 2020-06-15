package com.example.asassignmentkotlin.Question23

/**
 *12-jun-2020
 * @Bhagya Shri
 */


fun main() {
    // Extension function created for a class Circle
    fun String.replaceString(): String {
        return this.replace(" ", "_")
    }
    // create object for class Circle
    var str = "Replaced All space with _"
    // invoke member function
    println("replaced String  ${str.replaceString()}")
    //invoke extension function
}
