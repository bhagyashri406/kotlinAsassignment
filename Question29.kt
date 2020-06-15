package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {

    val list = ArrayList<CustomObject>()
    list.add(CustomObject("M"))
    list.add(CustomObject("N"))
    list.add(CustomObject("C"))
    list.add(CustomObject("Da"))
    list.add(CustomObject("B"))

    var sortedList = list.sortedWith(compareBy({ it.customProperty }))

    for (obj in sortedList) {
        println(obj.customProperty)
    }
}

public class CustomObject(val customProperty: String) {
}