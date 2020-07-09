package br.com.naniak.bank.exception

import java.lang.Exception

class AuthenticationFailedException( message: String = " Sorry , Authentication Failed") : Exception(message)