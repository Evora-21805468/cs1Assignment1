package pt.ulusofona.cm.kotlin.challenge.models

class Motor {
    var cavalos: Int = 0
    var cilindrada: Int = 0
    var ligado: Boolean = false

    constructor(cavalos: Int, cilindrada: Int) {
        this.cavalos = cavalos
        this.cilindrada = cilindrada
    }
}
