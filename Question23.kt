package com.example.asassignmentkotlin


/**
 *12-jun-2020
 * @Bhagya Shri
 */
interface RBI {

    fun createAccount(): Boolean
    fun getBalance(): Float
    fun withDraw(): Boolean
    fun Deposit(amount: Int): Float
}


class ICICI : RBI {

    var balance = 20.0
    override fun createAccount(): Boolean {
        return true;
    }
    override fun getBalance(): Float {
        return balance.toFloat()
    }
    override fun withDraw(): Boolean {
        return true
    }
    override fun Deposit(amount: Int): Float {
        balance=balance+amount
        return balance.toFloat()
    }
}

class HSBC : RBI {
    var balance = 3000.0
    override fun createAccount(): Boolean {
        return true;
    }
    override fun getBalance(): Float {
        return balance.toFloat()
    }
    override fun withDraw(): Boolean {
        return true
    }
    override fun Deposit(amount: Int): Float {
        balance=balance+amount
        return balance.toFloat()
    }

}


class BOB : RBI {
    var balance = 2100.0
    override fun createAccount(): Boolean {
        return true;
    }
    override fun getBalance(): Float {
        return balance.toFloat()
    }
    override fun withDraw(): Boolean {
        return true
    }
    override fun Deposit(amount: Int): Float {
        balance=balance+amount
        return balance.toFloat()
    }
}


class SBI : RBI {
    var balance = 1000.0
    override fun createAccount(): Boolean {
        return true;
    }
    override fun getBalance(): Float {
        return balance.toFloat()
    }
    override fun withDraw(): Boolean {
        return true
    }
    override fun Deposit(amount: Int): Float {
        balance=balance+amount
        return balance.toFloat()
    }
}



fun main(args: Array<String>) {
    val sbi = SBI()
    val bob = BOB()
    val hsbc = HSBC()
    val icici = ICICI()
    println("SBI Account created ${sbi.createAccount()}, Balance ${sbi.getBalance()} , Deposit ${sbi.Deposit(876)}")
    println("BOB Account created ${bob.createAccount()}, Balance ${bob.getBalance()} , Deposit ${bob.Deposit(2772)}")
    println("HSBC Account created ${hsbc.createAccount()}, Balance ${hsbc.getBalance()} , Deposit ${hsbc.Deposit(2923)}")
    println("ICICI Account created ${icici.createAccount()}, Balance ${icici.getBalance()} , Deposit ${icici.Deposit(876)}")

}
