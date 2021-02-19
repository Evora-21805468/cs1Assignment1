package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro (identificador: String, var motor: Motor): Veiculo(identificador), Movimentavel {

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

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | Posicao | x:${posicao.x} | y:${posicao.y} "
    }
}
