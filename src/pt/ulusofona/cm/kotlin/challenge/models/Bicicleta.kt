package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta: Movimentavel, Veiculo {
    override var identificador: String = ""

    constructor(identificador: String) {
        this.identificador = identificador
    }

    override fun requerCarta(): Boolean {
        return false
    }

    override fun moverPara(x: Int, y: Int) {

    }

    override fun toString(): String {
        return "Bicicleta | $identificador | $dataDeAquisicao | Posicao | x: ${posicao.x} | y: ${posicao.y} "
    }
}
