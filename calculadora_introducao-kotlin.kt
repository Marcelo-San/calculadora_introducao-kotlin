/*
 * Curso everis Kotlin Developer
 * Professora: Ana Luísa Dias
 * Aluno: Marcelo Santos TI 
 * 
 * Exercício Final
 * 
 * Com os conhecimentos aplicados anteriormente, vamos criar uma 
 * calculadora que, dados dois valores “Float?” e um número 
 * correspondente à operação (constante), retorne e imprima o 
 * resultado como Float ou uma mensagem de erro, 
 * caso um dos valores seja nulo. 
 * 
 * Use a sua criatividade! Adicione outras operações, 
 * fatorial, porcentagem, potenciação etc.
 * 
 */

// Função principal.
fun main() {
    var n1:Float? = 10.5F //Informo o valor aqui.
    var n2:Float? = 5F //Informo o valor aqui.
    val rSoma:Float
    val rSubtracao:Float
    val rMultiplicacao:Float
    val rDivisao:Float
    
    println("CALCULADORA")
    
    var num1 = n1 ?: 0
    var num2 = n2 ?: 0
    
    println("Números: $num1 e $num2")
    println()
           
    if(num1 == 0 || num2 == 0){
        println("ERRO! Um dos números é nulo!")
        
    } else {
    	println("SOMA")
        rSoma = soma(num1.toFloat(), num2.toFloat())
        println(rSoma)

        println("SUBTRAÇÃO")
        rSubtracao = subtracao(num1.toFloat(), num2.toFloat())
        println(rSubtracao)

        println("MULTIPLICAÇÃO")
        rMultiplicacao = multiplicacao(num1.toFloat(), num2.toFloat())
        println(rMultiplicacao)

        println("DIVISÃO")
        rDivisao = divisao(num1.toFloat(), num2.toFloat())
        println(rDivisao)	
    }
}

// Funções da calculadora.
fun soma(a: Float, b: Float) = a.plus(b)
fun subtracao(a: Float, b: Float) = a.minus(b)
fun multiplicacao(a: Float, b: Float) = a.times(b)
fun divisao(a: Float, b: Float) = a.div(b)
