package fundamentos

// por padrao a funcao abaixo retorna UNit e por isso nao precisa se declarada
// fun main(): Unit {}
fun main() {
    dizOi(retornaNome())
    dizOla(retornaNome(), 13) //se eu nao passar nada ele pega o setado mas se eu passar algo passa a valer o que eu passei.
}

fun retornaNome(): String {
    return "Henrique"
}

fun dizOi(nome: String) {
    println("Oi ${nome}")
}

fun dizOla(nome: String, idade: Int = 304) {
    println("Oi ${nome}, parabens pelos seus ${idade} anos")
}