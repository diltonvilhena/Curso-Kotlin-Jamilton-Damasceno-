
//Classe com 2 parametros já passados
//construtor primário
class Casas(var cor:String, var vagasGaragem:Int) {


    init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }


    fun detalhesCasa(){
        println("a casa tem a $cor e $vagasGaragem garagens na casas")
    }


}


fun main(){

    //instanciando a classe , criando um objeto casa
    //já passando os dados declarados como parametros do construtor
    val casa = Casas("amarela",2)


    casa.detalhesCasa()

}