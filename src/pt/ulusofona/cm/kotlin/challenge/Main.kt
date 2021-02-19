package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Carro
import pt.ulusofona.cm.kotlin.challenge.models.Data
import pt.ulusofona.cm.kotlin.challenge.models.Motor
import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.util.*

fun main(){
    println("Hello World!")
    var pessoa1: Pessoa = Pessoa("Gonçalo Évora", Date(1998,4,3))
    var pessoa2: Pessoa = Pessoa("Beatriz Lages", Date(1999,5,5))
    var carro1: Carro = Carro("12345", Motor(125,1000))
    var carro2: Carro = Carro("789456", Motor(250,2000))
    pessoa1.veiculos.add(carro1)
    pessoa1.comprarVeiculo(carro2)
    pessoa1.venderVeiculo("789456",pessoa2)
    println(pessoa1)
    println(Data.getIdade(pessoa1.dataDeNascimento))
}
