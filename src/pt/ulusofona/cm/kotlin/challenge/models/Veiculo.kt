package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo: Movimentavel{
    open var identificador: String = ""
    open lateinit var posicao: Posicao
    open lateinit var dataDeAquisicao: Date

    constructor(identificador: String) {
        this.identificador = identificador
    }

    constructor(){

    }

    override fun moverPara(x: Int, y: Int) {

    }

    fun requerCarta(): Boolean{
        return false
    }
}
