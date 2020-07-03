package br.com.naniak.bank.model

abstract class BankManager(
     name: String ,
     socialSecurityNumber: String,
     salary: Double,
     val pin: Int
): Employee(
    name = name,
    socialSecurityNumber = socialSecurityNumber,
    salary = salary
) {
    override val bonusPayment: Double
        get() = this.salary * 0.2
}