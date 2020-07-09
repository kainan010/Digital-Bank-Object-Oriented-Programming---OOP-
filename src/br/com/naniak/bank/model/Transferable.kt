package br.com.naniak.bank.model

import java.net.PasswordAuthentication

interface Transferable {

    fun transfer( amount: Double, toAccount: BankAccount, password : Int)



}