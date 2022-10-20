fun main(){
    //aqui a função é chamada
    exibirMensagem()

    //chamando função e passando parametro
    exibirNome("Dilton",19)

    val resultado = somar(2,5)
    println(resultado)

}

//tipo de função criada fora da função main
fun exibirMensagem(){
    println("Função Chamada")
}

//função com parametro, pode passar mais de 1 parametro
fun exibirNome (nome:String, idade:Int){
    println("olá $nome")
    println("sua idade é $idade anos")

}


fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}