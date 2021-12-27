package fundamentos

class ifelse {
}

fun main() {
    parOuImpar(2)
    parOuImpar(3)
    resultadoNota(3)
    resultadoNota(5)
    resultadoNota(8)

    println(parOuImparReturn(7)) // eu posso usar o if no return

}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}

fun parOuImparReturn(numero: Int): String{
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}

fun resultadoNota(nota: Int) {
    if(nota >= 6) {
        println("Passou.")
    } else if (nota >= 4)  {
        println("Recuperação.")
    } else {
        println("Reprovou.")
    }
}
