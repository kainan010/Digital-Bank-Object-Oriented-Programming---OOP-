package br.com.naniak.bank.exception

import java.lang.Exception

class InsufficientBalanceException(message : String = " Please , Try again ! , no Funds") : Exception(message)