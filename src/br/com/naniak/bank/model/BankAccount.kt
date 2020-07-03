package br.com.naniak.bank.model

abstract class BankAccount(
    val accountNumber: Int,
    val ownerAccount : Customer
) {
    var balance: Double = 0.0
        protected set

    companion object {
        var sum = 0
            private set
    }

    init {
        // Creating Account
        sum++
    }

     fun depositMoney(amount: Double) {
        if (amount > 0) {
            this.balance += amount
        }
    }
        abstract fun withdrawMoney(amount: Double)
//        if(amount > balance) {
//            return false
//        } else {
//            balance -= amount
//            return true
//        }
////    }
//
    }

