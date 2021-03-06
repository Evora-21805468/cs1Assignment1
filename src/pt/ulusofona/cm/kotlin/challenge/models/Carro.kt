package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro (identificador: String, var motor: Motor): Veiculo(identificador), Movimentavel, Ligavel {

    override fun requerCarta(): Boolean {
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        if (posicao.x == x && posicao.y == y){
            throw AlterarPosicaoException("Já se encontra nesta posição!")
        }
        if(!motor.estaLigado()){
            motor.ligar()
            posicao.alterarPosicaoPara(x,y)
            motor.desligar()
        } else {
            posicao.alterarPosicaoPara(x,y)
            motor.desligar()
        }
    }

    override fun ligar() {
        if(motor.estaLigado()){
            throw VeiculoLigadoException("Está ligado oh parvo")
        }
        motor.ligar()
    }

    override fun desligar() {
        if(!motor.estaLigado()){
            throw VeiculoDesligadoException("Está desligado oh bazeza")
        }
        motor.desligar()
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun toString(): String {
        return "Carro | $identificador | ${Data.getDate(dataDeAquisicao)} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }
}
