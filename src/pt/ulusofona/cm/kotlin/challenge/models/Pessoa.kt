package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*
import java.lang.reflect.Field
import java.time.LocalDate
import java.time.Period
import java.util.Arrays

data class Pessoa(var nome: String, var dataDeNascimento: Date) : Movimentavel {

    var veiculos = arrayListOf<Veiculo>()
    lateinit var carta: Carta
    var posicao: Posicao = Posicao(0,0)


    fun comprarVeiculo(veiculo: Veiculo){

    }

    fun pesquisarVeiculo(identificador: String): Veiculo {
        return Carro("ff",Motor(125,452))
    }

    fun pesquisarVeiculo(identificador: String, comprador: Pessoa): Veiculo {
        return Carro("ff",Motor(125,452))
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int){

    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){
        
    }

    fun temCarta(): Boolean{
        return false
    }

    fun tirarCarta(){

    }

    override fun moverPara(x: Int, y: Int) {

    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao | x: ${posicao.x} | y: ${posicao.y}"
    }

}
