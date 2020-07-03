package br.com.naniak.bank.model

class SavingsAccount (
    accountNumber: Int,
    ownerAccount : Customer
  //  val interestRate: Double
) : BankAccount(
    accountNumber = accountNumber,
    ownerAccount = ownerAccount
    ) {

//    fun depositInterest() {
//        val interest = balance * interestRate / 100
//        this.depositMoney(interest);
//    }

    override fun withdrawMoney(amount: Double) {
        if(this.balance >= amount){
            this.balance -= amount
        }
    }

}