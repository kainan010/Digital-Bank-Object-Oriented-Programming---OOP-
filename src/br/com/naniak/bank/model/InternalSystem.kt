package br.com.naniak.bank.model

class InternalSystem {

    fun access(admin: Authentication, password: Int){
        if (admin.authentic(password)){
            println("Congrats, you are in !!!")
        }else{
            println("Sorry , Try later  !!")
        }

    }
}