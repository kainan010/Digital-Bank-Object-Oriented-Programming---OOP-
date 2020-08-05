package br.com.naniak.bank.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*


fun bigDecimalListOf(vararg values: String): List<BigDecimal> {

    return List<BigDecimal>(values.size) { values[it].toBigDecimal() }
}


fun List<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acc, value ->
        acc + value
    }
}


fun List<BigDecimal>.average(): BigDecimal {

    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }


}


// aqui usamos api do java para formatar decimal com moeda usando Extension Function
fun BigDecimal?.formatForBrazilianCurrency(): String {
    val brazilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return brazilianFormat.format(this)

}

//fun BigDecimal?.printSalary(){
//    println("----------------------------")
//    println(this?.formatForBrazilianCurrency())
//    println("---------------------------")
//
//}