package br.com.dh.exc2

class Aposentadoria(var idade: Int, var sexo: String, var contribuicao: Int) {

    fun vouMeAposentar(): Boolean {
        return if (this.sexo.equals("M")) {
            this.idade >= 65 && contribuicao >= 30
        } else {
            this.idade >= 60 && contribuicao >= 30
        }
    }
}