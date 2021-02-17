package pt.ulusofona.cm.kotlin.challenge.models

class Carro {
    var identificador: String = ""
    lateinit var motor: Motor

    constructor(identificador: String, motor: Motor) {
        this.identificador = identificador
        this.motor = motor
    }
}
