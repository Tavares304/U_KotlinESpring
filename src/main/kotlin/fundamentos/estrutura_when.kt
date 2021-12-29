package fundamentos

fun main() {

//    val x = 14
//
//    // se o label estiver duplicado ele ira pegar o primeiro
//    when (x) {
//        5 -> println("x == ${x}")
//        8 -> println("x == ${x}")
//        10 -> {
//            println("x == ${x}")
//            println("x é uma Dezena")
//        }
//        in 11..20 -> println("x esta entre 11 e 20")
//        !in 30..50 -> println("x não esta entre 30 e 50")
//        else -> println("${x} não mapeado") //o else tem que ser o ultimo elemento se usado
//    }

//    println(comecaComOi("oi, eu sou o Goku!"))
//    println(comecaComOi("Verme Maldito"))

    when {
        comecaComOi("oi, eu sou o Goku!") -> print("oi, eu sou o Goku!")
        comecaComOi("Verme Maldito") -> print("Verme Maldito")
    }

}

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}