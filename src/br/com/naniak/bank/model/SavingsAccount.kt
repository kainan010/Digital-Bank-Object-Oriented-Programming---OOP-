package br.com.naniak.bank.model

import br.com.naniak.bank.exception.AuthenticationFailedException
import br.com.naniak.bank.exception.InsufficientBalanceException

class SavingsAccount (
    accountNumber: Int,
    ownerAccount : Customer
  //  val interestRate: Double
) : BankAccount(
    accountNumber = accountNumber,
    ownerAccount = ownerAccount
) , Transferable{

    override fun withdrawMoney(amount: Double) {
        if(this.balance >= amount){
            this.balance -= amount
        }
    }

    override fun transfer(amount: Double, toAccount: BankAccount, password : Int) {
        if(this.balance < amount) {
            throw InsufficientBalanceException("Please , Try again ! , no Funds...your balance : ${this.balance}")
        }

        if (!authentic(password)){
            throw AuthenticationFailedException()
        }

        this.balance -= amount
        toAccount.depositMoney(amount)

    }

}