package br.com.naniak.bank.test

import br.com.naniak.bank.exception.InsufficientBalanceException
import br.com.naniak.bank.model.BankAccount.Companion.sum
import br.com.naniak.bank.model.CurrentAccount
import br.com.naniak.bank.model.Customer
import br.com.naniak.bank.model.SavingsAccount

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
        savingAccountDylan.withdrawMoney(22.0)
    } catch (e: InsufficientBalanceException) {
        e.printStackTrace()
    }
    println(savingAccountDylan.balance)


    println(sum)

}