fun main(args: Array<String>) {
    println("Hello, world!")
    println(soma(6,3))
    println(subtracao(6,3))
    println(multiplicaco(6,3))
    printDivisao(6,3)
    println(foo("Patricia",43,true))
    susu(3,2)
    escolha(10)
}

fun soma(a:Int, b:Int):Int=
 	a+b

fun subtracao(a:Int, b:Int):Int{
    return a-b
}

fun multiplicaco(a:Int, b:Int) = a*b

fun printDivisao(a:Int, b:Int): Unit =
    println("A divisao de $a e $b é ${a / b}")

fun foo(nome:String, num:Int=42, maiusculo:Boolean=false) =
  (if(maiusculo)nome.toUpperCase() else nome) + num

fun susu(a:Int, b:Int){
  if(soma(a,b) > 5)println("Aprovado") else println("Reprovado")
}

fun escolha(x:Int) {
    when(x){
        in 0..3 -> println("valor ruim")
        in 4..7 -> println("valor aceito")
        in 8..9 -> println("valor ótimo")
        else -> { println("valor não encontrado")}
    }
}
