package com.example.asassignmentkotlin

import java.util.ArrayList

/**
 *12-jun-2020
 * @Bhagya Shri
 */


fun main(args: Array<String>) {
    val list = ArrayList<Int>()
    list.add(4)
    list.add(8)
    list.add(4)
    list.add(1)
    list.add(3)

    fun List<Int>.reverseList(): List<Int> {
        return this.reversed();
    }

    val listReverse = list.reverseList();
    println("ReverseList is :  $listReverse")
}


