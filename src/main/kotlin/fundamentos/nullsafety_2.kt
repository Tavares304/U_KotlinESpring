package fundamentos

fun main() {
    val pessoa: Pessoa? = null

    println(pessoa!!.nome) //vai dar erro
    println("não chega aqui")
}