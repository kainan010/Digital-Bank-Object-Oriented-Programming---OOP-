package br.com.naniak.bank.test

import br.com.naniak.bank.extension.average
import br.com.naniak.bank.extension.bigDecimalListOf
import br.com.naniak.bank.extension.formatForBrazilianCurrency

fun salary(){

    val salary = bigDecimalListOf("1550.00","2000.00","5000.00","9000.00","5342.00","19000.0")

    // sum of all + Brazilian Format
    val sumAllSalary= salary.reduce { acc, bigDecimal ->
        acc + bigDecimal
    }
    println(" The Sum of all Salaries : ${sumAllSalary.formatForBrazilianCurrency()}")

    //like you see when we can take the average from the list as we did below
    val averageOfSalaries = salary.average()
    println(" the Average from the salaries : ${averageOfSalaries.formatForBrazilianCurrency()}")

    // the highestSalary
    val highestSalary = salary.max()
    println(" the highest from the salaries : ${highestSalary.formatForBrazilianCurrency()}")

    // the LowestSalary
    val lowestSalary = salary.min()
    println(" the Lowest from the salaries : ${lowestSalary.formatForBrazilianCurrency()}")


    val isTrueAboutSalary = salary.all { it > "1000.00".toBigDecimal() }
    println(" Are There minimun Wage from salaries ? : $isTrueAboutSalary")

    val someRich = salary.any { it > "50000.00".toBigDecimal() }
    println(" Someone is gettting a high Salary Level from all History of the Company ? :  $someRich")


    val searchTheSalary = salary.find { it >= "2200.00".toBigDecimal() }
    println(" Im Searching my money, at least the first one above then 2200.00 >>> : $searchTheSalary")


    val listFromSalariesAboveSome = salary.filter { it > "10043.13".toBigDecimal() }
    println("Salaries which I picked up to show up for us above |10043.13| :  ${listFromSalariesAboveSome
        .sorted()
        .joinToString(" > ","","")}"
    )

    val countKindaSalaries = salary.count{it > "6000.00".toBigDecimal()}
    println(" how many salasries above 6000.00 > :  ${countKindaSalaries}")


    // how to take the average  for the last higest 3 salaries ???

    val lastThreeSalaries = salary
        .sorted()
        .takeLast(3)
        .average()
        .formatForBrazilianCurrency()

    println(" The last three highest salaries : $lastThreeSalaries")


}
