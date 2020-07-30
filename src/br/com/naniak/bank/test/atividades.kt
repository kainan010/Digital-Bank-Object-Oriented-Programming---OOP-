package br.com.naniak.bank.test

import kotlin.random.Random



    //testEmployees()
// Algumas vezes precisamos padronizar as informações antes de guardá-las no nosso sistema.
// Escreva uma função transformaParaMaiusculo(palavras). Essa função recebe como parâmetro um array de palavras.
// Ela deve retornar um array com a versão MAIÚSCULA de todas as palavras contidas no array passado como parâmetro.

    val palavras = mutableListOf("Kainan", "kaio", "Larissa", "tatiane", "jose", "nilda", "Mario")

    fun transformaParaMaiusculo(array : MutableList<String>): MutableList<String>{

        var arrayNova: MutableList<String> = mutableListOf()

        for (cont in 0..array.size ) {

            arrayNova.add(array[cont].toUpperCase())
        }
        return arrayNova
    }


  //  println(transformaParaMaiusculo(palavras))



fun atividadeDois(){

    var arrayRandom: MutableList<Int> = mutableListOf()

    for (i in 0 until 6){
        arrayRandom.add(Random.nextInt(6) +1)
    }
    println(arrayRandom.joinToString())



}

fun atividadeTres(valor1: Int ,valor2: Int ,valor3: Int ,valor4: Int ,valor5: Int ): Pair<Int?, Int?> {

     val lista = mutableListOf(valor1,valor2,valor3,valor4,valor5)

    val min = lista.min()
    val max = lista.max()

    val pair = Pair(min,max)

    return pair

}
// atividadeQuatro

//val nomeDoAluno = "kainan"
//val nomesDosPresentes = mutableListOf("kainan","jose","juba", "mario")

fun estavaPresenteNaAula(nomeDoAluno : String, nomesDosPresentes: MutableList<String>): Boolean{

    return nomesDosPresentes.contains(nomeDoAluno)

//    if(nomesDosPresentes.contains(nomeDoAluno)){
//        return true
//    }else{
//        return false
//    }

}


fun atividadeCinco(){
    val moradores = mutableListOf("Kainan", "kaio", "Larissa", "tatiane", "jose", "nilda", "Mario")

    for ( i in 0 until moradores.size){

        if(i % 2 == 0 ){
            println("o morador ${moradores[i]} , pode usar o apartamento  ")
        }
    }

}

fun atividadeSeis(){

    val usuario1 = Triple("Kainan", 24,1.69)
    val usuario2 = Triple("Kaio", 22,1.90)
    val usuario3 = Triple("jose", 12,1.80)
    val usuario4 = Triple("mario", 66,1.72)
    val usuario5 = Triple("rubens", 17,1.70)


    fun maiorAlto(usuario:Triple<String,Int,Double>): Boolean{

        if(usuario.second >= 18 && usuario.third >=1.70 ){
            return true
        }

        return false

    }

    println(maiorAlto(usuario1))
    println(maiorAlto(usuario2))
    println(maiorAlto(usuario3))
    println(maiorAlto(usuario4))
    println(maiorAlto(usuario5))
}

fun atividadeSete(){
    var alunos = mutableListOf(
        1.70,
        1.59,
        1.51,
        1.87,
        1.56,
        1.91,
        1.65,
        1.54,
        1.67,
        1.69,
        1.71,
        1.70,
        1.60
    )

    var grupoA : MutableList<Double> = mutableListOf()
    var grupoB : MutableList<Double> = mutableListOf()
    var grupoC : MutableList<Double> = mutableListOf()


    for(i in 0 until alunos.size){

        when(alunos[i]){

            in  1.50..1.59 -> grupoA.add(alunos[i])
            in  1.60..1.69 -> grupoB.add(alunos[i])
            else -> grupoC.add(alunos[i])

        }
    }
    println(grupoA)
    println(grupoB)
    println(grupoC)
}
// pode mudar pra melhor e terminar
fun atividadeOito(){
    val placas = mutableListOf("RXB-2525", "AKX-3333", "ORO-7142", "RXB-2525", "AKX-3333", "ORO-7142", "AKX-3333", "RXB-2525", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "RXB-2525", "AKX-3333", "ORO-7142", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "ORO-7142", "ORO-7142", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "ORO-7142", "ORO-7142", "AKX-3333", "ORO-7142", "ORO-7142", "ORO-7142", "RXB-2525", "AKX-3333", "AKX-3333", "ORO-7142", "ORO-7142", "AKX-3333", "RXB-2525", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "RXB-2525", "AKX-3333", "ORO-7142", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "ORO-7142", "ORO-7142", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "AKX-3333", "RXB-2525", "AKX-3333", "AKX-3333", "RXB-2525")
    val placao : MutableMap<String , String > = mutableMapOf()

    fun calcularNumeroDeEntradas(placa : MutableList<String>): Int{
        var numerosEntradas = 0


        for(i in 0 until placa.size){
            if (placas[i] == placa[i]){
                placao.put(placas[i],"Valor-${i}")
                numerosEntradas ++
            }
        }

        return numerosEntradas
    }

    fun calcularValorDevido(placas : MutableList<String>): Double{


        // "RXB-2525", "AKX-3333", "ORO-7142","RXB-2525"

        return 12.3
    }

// pode mudar pra melhor
fun atividadeNove(){

    val notas: MutableList<Int> = mutableListOf(1,3,2,4,2,1,1,0,0,0,2,5,5,3)

    //


    fun  calculaGostos(notas : MutableList<Int>): MutableMap<Int, String>{

        val notasDivididas: MutableMap<Int,String> = mutableMapOf()

        var numeroNaoGosta = 0
        var numeroMediano = 0
        var numeroGosta = 0
        for (i in 0 until notas.size) {

            when (notas[i]) {
                in 0..1 -> numeroNaoGosta++
                in 2..3 -> numeroMediano++
                in 4..5  -> numeroGosta++
            }

        }

        notasDivididas.put(numeroNaoGosta ," Pessoas nao gostam do filme")
        notasDivididas.put(numeroMediano ," Pessoas acham o filme mediano")
        notasDivididas.put(numeroGosta ,"  Pessoas gostam de verdade")

        return notasDivididas

    }

    val notasComValor = calculaGostos(notas)

    println(notasComValor)
}

    // Sessao desafio final da Bolsa em Kotlin 6 no total

    fun dasafioUm(){
        val personagens = mutableListOf("Hermione", "Trinity", "Leia")
        val filmes = mutableListOf("Harry Potter", "Matrix", "Star wars")
        val lancamentos = mutableListOf(2001, 1999, 1977)


        fun filme(
            personagens:  MutableList<String>,
            filmes: MutableList<String>,
            anoEstreia: MutableList<Int>,
            id : Int
        ):  String  {
            var novaFrase = ""

            if(id > 0 &&  id <= filmes.size){
                novaFrase = " ${personagens[id -1]} é um personagem do filme ${filmes[id -1]} que estreou no cinema em ${anoEstreia[id -1 ]}."

            }else{
                return "Essa não é uma opção válida."
            }



            return novaFrase
        }

        val testa=  filme(personagens,filmes,lancamentos,0)

        println(testa)

    }

    fun dasafioDois(){


        val harryPotterSeries = mutableListOf(
            "e a Pedra Filosofal",
            "e a Câmara Secreta",
            "e o Prisioneiro de Azkaban",
            "e o Cálice de Fogo",
            "e a Ordem da Fênix",
            "e o Enigma do Príncipe",
            "e as Relíquias da Morte"
        )
        fun series(nomeSerie: String,lista:MutableList<String>) : MutableList<String>{
            val listaNova : MutableList<String> = mutableListOf()
            for(indice in lista.indices){
                //  nomeSerie+ lista[i]
                listaNova.add("$nomeSerie ${lista[indice]}")

            }

            return listaNova
        }

        val teste =   series("Harry Potter",harryPotterSeries)

        println(teste)
    }


    fun dasafioTres(){

        val numeros: MutableList<Int> = mutableListOf(10, 4, 7, 128, 42, -1, 0, 300, -5)
        fun maiorQueNum(lista : MutableList<Int>, numeroMaior: Int): MutableList<Int>{

            var numerosMaiores : MutableList<Int> = mutableListOf()

            lista.forEach {
                if(it > numeroMaior){
                    numerosMaiores.add(it)
                }
            }

//            for(i in 0 until lista.size){
//                if(lista[i] > numeroMaior){
//
//                    numerosMaiores.add(lista[i])
//                }
//            }
            return numerosMaiores

        }

        //------------------------------------------
        // Segunda versão do problema
//        val numeros: MutableList<Int> = mutableListOf(10, 4, 7, 128, 42, -1, 0, 300, -5)
//        fun maiorQueNum(lista : MutableList<Int>, numeroMaior: Int): MutableList<Int>{
//
//            var numerosMaiores : MutableList<Int> = mutableListOf()
//            var num = 0
//
//            for(i in 0 until lista.size){
//
//                num = lista.max()!!
//                numerosMaiores.add(num)
//                lista.remove(num)
//
//            }
//
//            return numerosMaiores.subList(0,numeroMaior)
//
//        }
//
//        val testa = maiorQueNum(numeros,5)
//
//        println(testa)5

    }

 // melhorar pois nao terminou
    fun dasafioQuatro(){
        val numeros: MutableList<Int> = mutableListOf(0,0,0,0,0,0,0,0,0,0,0,5,5,3)
        fun buscarDivisivelPor(numeros: MutableList<Int>,numeroTeste:Int){

            for(i in 0 until numeros.size){

                if(numeros[i]!=0 && numeroTeste % numeros[i] == 0  ){
                    println(numeros[i])
                    break
                    //  println("Nenhum número válido encontrado!")
                }
            }



        }


        buscarDivisivelPor(numeros,8)
    }


    fun dasafioCinco(){
        fun repetirPalavras(palavra: String,quantasVezes : Int){
            for(i in 0 until quantasVezes){
                println(palavra)
            }
        }

        repetirPalavras("kainan",3)

    }


    fun dasafioSeis(){
        fun comissao(preco: Double , porcetagem: Double) : Double{

            return  preco * porcetagem / 100


        }
    }




}