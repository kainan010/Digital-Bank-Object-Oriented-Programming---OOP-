package br.com.naniak.bank.test

import br.com.naniak.bank.exception.InsufficientBalanceException
import br.com.naniak.bank.model.BankAccount.Companion.sum
import br.com.naniak.bank.model.CurrentAccount
import br.com.naniak.bank.model.Customer
import br.com.naniak.bank.model.SavingsAccount
import java.text.DecimalFormat
import kotlin.math.IEEErem
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.roundToLong
import kotlin.time.microseconds

fun testBankAccounts() {
    println("---------------------------------------------------")
    println("ACCOUNT 1 - Joseph ")
        // Person 1 for Current Account
     val customerJoseph = Customer("Joseph", "111-111-11",1212)
    val currentAccountJoseph = CurrentAccount(ownerAccount = customerJoseph, accountNumber = 1111)

    currentAccountJoseph.depositMoney(100.0)
    println(currentAccountJoseph.balance)

    try {
        currentAccountJoseph.withdrawMoney(22.0)
    } catch (e: InsufficientBalanceException) {
        e.printStackTrace()
    }
    println(currentAccountJoseph.balance)



    println("---------------------------------------------------")
    println("ACCOUNT 2 - Dylan  ")

    //Person 2 for SavingAccount
    val customerDylan = Customer(name = "CustomerDylan", socialSecurityNumber = "222-222-22", pin = 2121)
    val savingAccountDylan = SavingsAccount(ownerAccount = customerDylan, accountNumber = 2222)

    savingAccountDylan.depositMoney(100.0)
    println(savingAccountDylan.balance)

    try {
        savingAccountDylan.withdrawMoney(40.0)
    } catch (e: InsufficientBalanceException) {
        e.printStackTrace()
    }catch (e: Exception){
        e.printStackTrace()
        println("Error , Try Again !!!")
    }

    // Before transfering Account (Joseph)
    println(currentAccountJoseph.balance)


    // Before transfering Account (Joseph)
    println(savingAccountDylan.balance)

    println("------Test Transfer Account ----")
    try {
        currentAccountJoseph.transfer(amount = 5990.0, toAccount = savingAccountDylan)
    } catch (e: InsufficientBalanceException) {
        println("Sorry, No Funds at moment !!! ")
        e.printStackTrace()

    }
    //After Transfering Acocunt from Joseph  to Dylan
    val amoutJoseph = currentAccountJoseph.balance
    println("%.2f".format(amoutJoseph))

    //Dylan´s Account
    println(savingAccountDylan.balance)


    println("-----------------------------------------------")
    println("How many Accounts have been created so far ? ")
    println(sum)

}