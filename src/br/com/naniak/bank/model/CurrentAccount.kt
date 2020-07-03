package br.com.naniak.bank.model

import br.com.naniak.bank.exception.InsufficientBalanceException

class CurrentAccount (
    accountNumber: Int,
    ownerAccount : Customer
) : BankAccount(
    accountNumber = accountNumber,
    ownerAccount = ownerAccount
){

    override fun withdrawMoney(amount: Double) {
        val amountTaxes = amount + 0.1

        if(this.balance >= amountTaxes){
            this.balance -= amountTaxes
        }else{
            throw InsufficientBalanceException()
        }
    }

}