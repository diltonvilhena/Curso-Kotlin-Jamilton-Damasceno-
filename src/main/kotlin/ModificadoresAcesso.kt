

open class Carros{
    //private somente pela própria classe
    //public

    //protected pode ser usado somente por classe filha
    protected val  nome = "Toyota"

}

class Toyota: Carros() {

    fun exibirNome() {
        println("nome do carro é $nome")
    }
}


fun main() {

    val carro = Toyota()
    carro.exibirNome()

}

