package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

class Time(internal var hours: Int, internal var minutes: Int, internal var seconds: Int)

fun main(args: Array<String>) {
    val start = Time(10, 15, 45)
    val stop = Time(7, 11, 10)
    val diff: Time

    diff = difference(start, stop)

    print("TIME DIFFERENCE: ${start.hours}:${start.minutes}:${start.seconds} - ")
    print("${stop.hours}:${stop.minutes}:${stop.seconds} ")
    print("= ${diff.hours}:${diff.minutes}:${diff.seconds}")
}

fun difference(start: Time, stop: Time): Time {
    val diff = Time(0, 0, 0)

    if (stop.seconds > start.seconds) {
        --start.minutes
        start.seconds += 60
    }

    diff.seconds = start.seconds - stop.seconds
    if (stop.minutes > start.minutes) {
        --start.hours
        start.minutes += 60
    }

    diff.minutes = start.minutes - stop.minutes
    diff.hours = start.hours - stop.hours

    return diff
}
