package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro : Veiculo, Movimentavel {
    override var identificador: String = ""
    var motor: Motor

    constructor(identificador: String, motor: Motor) : super() {
        this.identificador = identificador
        this.motor = motor
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | Posicao | x: ${posicao.x} | y: ${posicao.y} "
    }
}
