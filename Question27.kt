package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */
fun main(args: Array<String>) {

    var capitals = hashMapOf<String, String>()
    capitals.put("A", "Hemant")
    capitals.put("B", "Devangna")
    capitals.put("C", "Aakash")
    capitals.put("D", "Shraya")
    capitals.put("E", "Abhimanyu")

    val result = capitals.toList().sortedBy { (_, value) -> value }.toMap()

    for (entry in result) {
        print("Key: " + entry.key)
        println(" Value: " + entry.value)
    }
}