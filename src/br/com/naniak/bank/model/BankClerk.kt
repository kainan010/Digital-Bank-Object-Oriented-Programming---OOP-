package br.com.naniak.bank.model

class BankClerk(
    name: String ,
    socialSecurityNumber: String,
    salary: Double
): Employee(
    name = name,
    socialSecurityNumber = socialSecurityNumber,
    salary = salary
) {
    override val bonusPayment: Double
        get() = this.salary * 0.1

}