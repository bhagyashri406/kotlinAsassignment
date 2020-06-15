package com.example.asassignmentkotlin

import java.util.ArrayList

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {

    val list1 = ArrayList<String>()
    list1.add("a")
    list1.add("b")
    list1.add("c")

    val list2 = ArrayList<String>()
    list2.add("d")
    list2.add("e")
    list2.add("f")

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")

}