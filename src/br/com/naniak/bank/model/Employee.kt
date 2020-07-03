package br.com.naniak.bank.model

abstract class Employee(
    val name: String ,
    val socialSecurityNumber: String,
    val salary: Double
) {
   abstract val bonusPayment: Double
}