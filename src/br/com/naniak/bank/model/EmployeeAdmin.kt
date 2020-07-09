package br.com.naniak.bank.model

abstract class EmployeeAdmin(
    name: String ,
    socialSecurityNumber: String,
    salary: Double,
    protected val password: Int
) : Employee(
    name = name ,
    socialSecurityNumber = socialSecurityNumber,
    salary = salary
), Authentication{

    override fun authentic(password: Int): Boolean {
        if (this.password === password){
            return true
        }
        return false
    }
}