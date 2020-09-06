package br.com.dh.exc1

fun main() {
    println(fatorial(5))
}

fun fatorial(num: Int): Int {
    var fat: Int = 1

    for (i in 1 .. num) {
        fat *= i
    }

    return fat
}