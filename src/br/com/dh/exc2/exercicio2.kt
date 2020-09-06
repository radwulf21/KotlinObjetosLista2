package br.com.dh.exc2

fun main() {
    var pessoa1 = Aposentadoria(60, "F", 30)
    var pessoa2 = Aposentadoria(65, "M", 30)

    println(pessoa1.vouMeAposentar())
    println(pessoa2.vouMeAposentar())
}