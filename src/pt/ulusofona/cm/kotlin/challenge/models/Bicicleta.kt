package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta: Movimentavel, Veiculo() {
    override var identificador: String = ""

    constructor(identificador: String) {
        this.identificador = identificador
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | Posicao | x: ${posicao.x} | y: ${posicao.y} "
    }
}
