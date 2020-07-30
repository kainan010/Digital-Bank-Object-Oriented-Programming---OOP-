package br.com.naniak.bank.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*


fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {

    return Array<BigDecimal>(values.size) { values[it].toBigDecimal() }
}


fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acc, value ->
        acc + value
    }
}


fun Array<BigDecimal>.average(): BigDecimal {

    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }


}


// aqui usamos api do java para formatar decimal com moeda usando Extension Function
fun BigDecimal.formatForBrazilianCurrency(): String {
    val brazilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return brazilianFormat.format(this)

}