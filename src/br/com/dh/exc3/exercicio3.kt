package br.com.dh.exc3

fun main() {
    var listaNum = arrayListOf<Int>()
    listaNum.add(1)
    listaNum.add(4)
    listaNum.add(7)

    val calculo = Calculadora(listaNum)
    println(calculo.multArray())
}