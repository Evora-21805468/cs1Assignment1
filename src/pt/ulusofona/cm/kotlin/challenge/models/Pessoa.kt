package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa {
    lateinit var nome: String
    var veiculos: listOf<Veiculo> = null
    lateinit var dataDeNascimento: Date
    lateinit var carta: Carta
    lateinit var posicao: Posicao

    constructor(nome: String, dataDeNascimento: Date) {
        this.nome = nome
        this.dataDeNascimento = dataDeNascimento
    }

    fun comprarVeiculo(veiculo: Veiculo){

    }

    fun pesquisarVeiculo(identificador: String): Veiculo {
        return null
    }

    fun pesquisarVeiculo(identificador: String, comprador: Pessoa): Veiculo {
        return null
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int){

    }

    fun temCarta(): Boolean{
        return false
    }

    fun tirarCarta(){

    }
}
