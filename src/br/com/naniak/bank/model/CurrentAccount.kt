package br.com.naniak.bank.model

import br.com.naniak.bank.exception.AuthenticationFailedException
import br.com.naniak.bank.exception.InsufficientBalanceException

class CurrentAccount (
    accountNumber: Int,
    ownerAccount : Customer
) : BankAccount(
    accountNumber = accountNumber,
    ownerAccount = ownerAccount
),Transferable{
    override fun withdrawMoney(amount: Double) {
        val amountTaxes = amount + 0.1

        if(this.balance >= amountTaxes){
            this.balance -= amountTaxes
        }else{
            throw InsufficientBalanceException()
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