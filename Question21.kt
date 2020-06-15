package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

open class Payment() {

    open var amount: Double
        get() {
            return this.amount
        }
        set(value) {
            this.amount = value
        }

    open fun paymentDetails(): String {
        return "Amount:   ${this.amount}"
    }

}

class CashPayment(override var amount: Double) : Payment() {
    override fun paymentDetails(): String {
        return "Payment in Cash amount is :   ${this.amount}"
    }
}

class CreditCardPayment(
    override var amount: Double,
    var nameOnCard: String, var exprirationDate: String,
    var cardNumber: Int
) : Payment() {
    override fun paymentDetails(): String {
        return "Payment with Card -  amount : ${this.amount} , Name on Card : ${this.nameOnCard} , expriration date : $exprirationDate , Card Number : $cardNumber "
    }
}


//main method
fun main(args: Array<String>) {

    var cashPayment = CashPayment(34455.0)
    println("${cashPayment.paymentDetails()}")

    var cashPayment2 = CashPayment(2133213.0)
    println("${cashPayment2.paymentDetails()}")

    var creditCardPayment = CreditCardPayment(33232.0, "Bhagya shri", "12-05-2027", 221381843)
    println("${creditCardPayment.paymentDetails()}")

    var creditCardPayment2 = CreditCardPayment(1111.0, "MAAHII", "22-06-2057", 959818399)
    println("${creditCardPayment2.paymentDetails()}")

}
