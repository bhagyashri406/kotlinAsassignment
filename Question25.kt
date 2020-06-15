package com.example.asassignmentkotlin

import java.util.ArrayList
import java.util.HashMap

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main() {
    val hMap: MutableMap<String, Int> = HashMap()
    hMap["A"] = 65
    hMap["B"] = 66
    hMap["C"] = 67

    val entries: List<String> = hMap.entries.map { "(${it.key}, ${it.value})" }
    entries.forEach { print(it) }
}