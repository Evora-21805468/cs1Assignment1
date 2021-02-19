package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

open class Motor: Ligavel {
    var cavalos: Int = 0
    var cilindrada: Int = 0
    var ligado: Boolean = false

    constructor(cavalos: Int, cilindrada: Int) {
        this.cavalos = cavalos
        this.cilindrada = cilindrada
    }

    override fun ligar() {
        ligado = true
    }

    override fun desligar() {
        ligado = false
    }

    override fun estaLigado(): Boolean {
        if(ligado){
            return true
        }
        return false
    }


    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}
