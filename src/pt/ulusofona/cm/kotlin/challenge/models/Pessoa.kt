package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
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
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String): Veiculo {
        for(i in veiculos){
            if(i.identificador == identificador){
                return i
            }
        }
        throw VeiculoNaoEncontradoException("Oh zé! Não há veiculo com esse identificador!")
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int){
        var veiculo = pesquisarVeiculo(identificador)
        if (veiculo.requerCarta() && !(temCarta())){
            throw PessoaSemCartaException("$nome não tem carta para conduzir o veículo indicado")
        }

        if(veiculo.requerCarta() && temCarta()){
            if(veiculo.identificador == identificador){
                veiculo.moverPara(x,y)
            }
        }

        if(!veiculo.requerCarta()){
            if(veiculo.identificador == identificador){
                veiculo.moverPara(x,y)
            }
        }
        throw AlterarPosicaoException("Não podes mover!")
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){
        var veiculo2 = pesquisarVeiculo(identificador)
        veiculos.remove(veiculo2)
        comprador.veiculos.add(veiculo2)
    }

    fun temCarta(): Boolean{
        return true
    }

    fun tirarCarta(){

    }

    override fun moverPara(x: Int, y: Int) {

    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao | x: ${posicao.x} | y: ${posicao.y}"
    }

}

