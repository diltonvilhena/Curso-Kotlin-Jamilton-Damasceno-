
//Classe
class Casa {

    //propriedades
  var cor: String = ""

    //método
    fun abrirJanela(){
        println("abrir janela")
    }

    //utilizamos o this. para utilizar outros métodos da classe
    fun abrirCasa(){
        this.abrirJanela()
    }

}


fun main(){

    //instanciando a classe , criando um objeto casa
    val casa = Casa()
    casa.cor = "amarela"
   // casa.abrirJanela()
    casa.abrirCasa()

//     val casa2 = Casa()
//    casa2.cor = "azul"

    println(casa.cor)
    //println(casa2.cor)

}