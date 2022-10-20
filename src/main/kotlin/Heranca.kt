

//para ser utilizado como classe pai, devemos utilizar o open
 open class Animal {

    //abrir também com o open se for usar em uma sobrescrita de método
    open fun dormir(){
        println("dormir")
    }

}

//utilizamos o ":classePai()" para representar a extensão de uma classe
 class Cao: Animal() {

    //sobrescrita de método
     override fun dormir(){
        //chamando o método sem ter que criar do zero, com o super.método
        super.dormir()
        println("como um cão")
     }

}

 /*class  Passaro: Animal() {

 }*/


fun main(){

    //instanciando o objeto
    val cao = Cao()
    cao.dormir()



}

