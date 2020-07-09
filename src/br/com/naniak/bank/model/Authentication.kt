package br.com.naniak.bank.model

interface Authentication {

    fun authentic(passaword:Int) : Boolean

}