package br.com.naniak.bank.test

import br.com.naniak.bank.model.BankClerk
import br.com.naniak.bank.model.BankDirector
import br.com.naniak.bank.model.BankManager

fun testEmployees(){

    val bankClerkAna = BankClerk(
        name = "Ana",
        socialSecurityNumber = "111-111-11",
        salary = 1.000
    )

    val bankDirectorGabriel = BankDirector(
        name = "Gabriel",
        socialSecurityNumber = "222-222-22",
        salary = 2.000,
        password = 4433,
        profitSharing = 500.0
    )


    val bankManagerClark = BankManager(
        name = "Clark",
        socialSecurityNumber = "333-333-33",
        salary = 3.000,
        password = 2211
    )

    // Ana - Bank Clerk
    println("Name : ${bankClerkAna.name}")
    println("Social Security Number : ${bankClerkAna.socialSecurityNumber}")
    println("Salary : ${bankClerkAna.salary}")

    println("--------------------------------")

    // Gabriel - Bank Director
    println("Name : ${bankDirectorGabriel.name}")
    println("Social Security Number : ${bankDirectorGabriel.socialSecurityNumber}")
    println("Salary : ${bankDirectorGabriel.salary}")
    println("Profit Sharing : ${bankDirectorGabriel.profitSharing}")

    if(bankDirectorGabriel.authentic(4433)){
        println("Congrats !! you are authenticated , ${bankDirectorGabriel.name}")
    }else{
        println(" Sorry, Try again , ${bankDirectorGabriel.name}.")
    }


    println("--------------------------------")

    // Clark -  Bank Manager
    println("Name : ${bankManagerClark.name}")
    println("Social Security Number : ${bankManagerClark.socialSecurityNumber}")
    println("Salary : ${bankManagerClark.salary}")

    if(bankManagerClark.authentic(2211)){
        println("Congrats !! you are authenticated , ${bankManagerClark.name}")
    }else{
        println(" Sorry, Try again , ${bankManagerClark.name}.")
    }


}