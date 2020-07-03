package br.com.naniak.bank.model

class BankDirector(
    name: String ,
    socialSecurityNumber: String,
    salary: Double,
    val pin: Int,
    val profitSharing: Double
): Employee(
    name = name,
    socialSecurityNumber = socialSecurityNumber,
    salary = salary
) {
    override val bonusPayment: Double
        get() = this.salary + profitSharing
}