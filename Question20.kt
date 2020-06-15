package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

class Player(val runs: Int, val number_of_matches: Int) {
    operator fun plus(p: Player) =
        Player(
            this.runs + p.runs,
            this.number_of_matches + p.number_of_matches
        )

}

fun main(args: Array<String>) {

    var player = Player(55, 9)
    var player2 = Player(77, 2)
    var p = player.plus(player2)

    println("runs : ${p.runs} ,numbers of matches :${p.number_of_matches}")

}