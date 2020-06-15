package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

class BankAccount(
    val depositorName: String,
    val accountNumber: Int,
    val type: String,
    var balance: Int
) {

    fun assignInitialValue() {
        println("Initial amount is $balance ")
    }

    fun depositAmount(depositAmount: Int) {
        this.balance = this.balance + depositAmount
        println("Deposit amount is $depositAmount ")
    }

    fun withdrawAmount(withdrawAmount: Int): Boolean {
        if (balance - withdrawAmount >= 0) {
            this.balance = this.balance - withdrawAmount
            println("Withdraw Amount: $withdrawAmount , Balance : $balance")
            return true
        } else {
            println("Your Balance is Less")
            return false
        }
    }

    fun display() {
        println("Account Holder name :  ${this.depositorName} and account balance : ${this.balance}")
    }
}

fun main(args: Array<String>) {

    val bankAccount = BankAccount("Devangna", 123, "Saving", 1000)

    bankAccount.assignInitialValue();
    bankAccount.depositAmount(2000)
    bankAccount.withdrawAmount(2300)
    bankAccount.display()

    val bankAccount2 = BankAccount("Narendra", 111, "Saving", 1000)

    bankAccount2.assignInitialValue();
    bankAccount2.depositAmount(3333)
    bankAccount2.withdrawAmount(6453)
    bankAccount2.display()


    val bankAccount3 = BankAccount("Satya", 122, "Current", 1111)

    bankAccount3.assignInitialValue();
    bankAccount3.depositAmount(47623)
    bankAccount3.withdrawAmount(3432)
    bankAccount3.display()


    val bankAccount4 = BankAccount("Deva", 332, "saving", 20000)

    bankAccount4.assignInitialValue();
    bankAccount4.depositAmount(3434)
    bankAccount4.withdrawAmount(2000)
    bankAccount4.display()

}