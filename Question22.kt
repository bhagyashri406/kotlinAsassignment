package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

open class Book(val isbn: Boolean, val title: String, val price: Double) {
    fun init() {
        println("Book title :  $title , price : $price , isbn :  $isbn")
    }
}

class Magazine(
    isbn: Boolean,
    title: String,
    price: Double, var type: String
) :
    Book(isbn, title, price) {
    fun magazineType() {
        println("and type : $type")
    }
}

class Novel(
    isbn: Boolean,
    title: String,
    price: Double, var author: String
) :
    Book(isbn, title, price) {

    fun novelAuthor() {
        println("and author :  $author")
    }
}


//main method
fun main(args: Array<String>) {
    val magazine = Magazine(
        false,
        "THE LIFE",
        400.0,
        "Magazine"
    )
    magazine.init()
    magazine.magazineType()
    println()
    val novel = Novel(
        true,
        "five mistakes of life",
        300.0,
        "Chetan Bhagat"
    )
    novel.init()
    novel.novelAuthor()

}


