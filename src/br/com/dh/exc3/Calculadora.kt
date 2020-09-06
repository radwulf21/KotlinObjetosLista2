package br.com.dh.exc3

class Calculadora(listaNum: ArrayList<Int>) {
    var listaNum = arrayListOf<Int>()

    init {
        this.listaNum = listaNum
    }

    fun multArray(): Int {
        var produto: Int = 1

        for (num in this.listaNum) {
            produto *= num
        }

        return produto
    }
}