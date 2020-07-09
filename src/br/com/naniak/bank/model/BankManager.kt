package br.com.naniak.bank.model

abstract class BankManager(
     name: String ,
     socialSecurityNumber: String,
     salary: Double,
     password:Int
): EmployeeAdmin(
    name = name,
    socialSecurityNumber = socialSecurityNumber,
    salary = salary,
    password = password
) {
    override val bonusPayment: Double
        get() = this.salary * 0.2
}