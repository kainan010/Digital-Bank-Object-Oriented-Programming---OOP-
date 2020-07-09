package br.com.naniak.bank.model

class Customer(
    val name: String,
    val socialSecurityNumber: String,
    private val password : Int
): Authentication {

    override fun authentic(password: Int): Boolean {
        if (this.password === password){
            return true
        }
        return false
    }


}