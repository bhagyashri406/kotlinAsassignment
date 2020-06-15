package com.example.asassignmentkotlin

import java.util.ArrayList

/**
 *12-jun-2020
 * @Bhagya Shri
 */


open class Cricket(
    var player_name: String,
    var num_of_matches: Int,
    var run: Int
) {

    fun update(
        player_name: String,
        num_of_matches: Int,
        run: Int
    ) {
        this.player_name = player_name
        this.num_of_matches = num_of_matches
        this.run = run
    }


    fun Search(name: String): String {
        if (name.equals(this.player_name))
            return "Name : $this.player_name , number of matches : $this.num_of_matches , run : $this.run "
        else
            return "No match found"
    }

    fun Fifties(): Int {
        return this.run / 50
    }

    fun Hundreds(): Int {
        return this.run / 100
    }

}


class Batsman(player_name: String, num_of_matches: Int, run: Int) :
    Cricket(player_name, num_of_matches, run) {

    fun Display(): String {
        return "Name : ${this.player_name} , number of matches : ${this.num_of_matches} , run : ${this.run} , numbers Fifty : ${this.Fifties()} , numbers of hundrads ${this.Hundreds()}   "
    }

}

class Bowler(player_name: String, num_of_matches: Int, run: Int, val wickets: Int, val Overs: Int) :
    Cricket(player_name, num_of_matches, run) {


    fun Wickets(): Int {
        return this.wickets
    }

    fun Overs(): Int {
        return this.Overs
    }

    fun Display(): String {
        return "Name : ${this.player_name} , number of matches : ${this.num_of_matches} , run : ${this.run} , numbers of wickets : ${this.wickets} , numbers of overs ${this.Overs} }   "
    }

}

fun write_to(BatmanList: List<Batsman>, BowlerList: List<Bowler>) {

    BowlerList.forEach {
        println("The element is ${it.Display()}")
    }

    BatmanList.forEach {
        println("The element is ${it.Display()}")
    }
}

fun main(args: Array<String>) {

    var batsman1 = Batsman("batsman1", 15, 1000)
    var Bowler1 = Bowler("Bowler1", 12, 330, 5, 40)
    var batsman2 = Batsman("batsman2", 25, 333)
    var Bowler2 = Bowler("Bowler2", 32, 430, 15, 100)
    var batsman3 = Batsman("batsman3", 95, 4443)
    var Bowler3 = Bowler("Bowler3", 51, 230, 55, 10)
    var batsman4 = Batsman("batsman4", 25, 422)
    var Bowler4 = Bowler("Bowler4", 51, 20, 43, 80)

    var BatmanList = ArrayList<Batsman>()
    BatmanList.add(batsman1)
    BatmanList.add(batsman2)
    BatmanList.add(batsman3)
    BatmanList.add(batsman4)

    var BowlerList = ArrayList<Bowler>()
    BowlerList.add(Bowler1)
    BowlerList.add(Bowler2)
    BowlerList.add(Bowler3)
    BowlerList.add(Bowler4)

    println("Batsman1 :  ${batsman1.Display()}")
    println("Bowler :  ${Bowler1.Display()}")

    write_to(BatmanList, BowlerList)

}


