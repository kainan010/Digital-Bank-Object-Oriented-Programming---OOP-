package br.com.naniak.bank.model

class BankDirector(
    name: String ,
    socialSecurityNumber: String,
    salary: Double,
    password: Int,
    val profitSharing: Double
): EmployeeAdmin(
    name = name,
    socialSecurityNumber = socialSecurityNumber,
    salary = salary,
    password = password
) {
    override val bonusPayment: Double
        get() = this.salary + profitSharing
}