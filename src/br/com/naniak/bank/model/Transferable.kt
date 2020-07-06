package br.com.naniak.bank.model

interface Transferable {

    fun transfer( amount: Double, toAccount: BankAccount)



}