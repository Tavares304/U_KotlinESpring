package fundamentos

fun main() {

    printa10a1()
    printa1a10()
    printaPar1a10()
    printaRange(50, 60)
    whileMenorQue10()
    println()
    doWhileMenorQue10()

}

fun printa1a10 () {

    for (numero in 1 .. 10) {
        println(numero)
    }
}

fun printa10a1 () {

    for (numero in 10 downTo  1) {
        println(numero)
    }
}

fun printaPar1a10 () {

    for (numero in 1 .. 10 step 2) {
        println(numero)
    }
}

fun printaRange (inicio: Int, fim: Int) {

    for (numero in inicio .. fim) {
        println(numero)
    }
}

fun whileMenorQue10(){
    var x = 0;
    while (x < 10) {
        print(x)
        x++
    }
}

fun doWhileMenorQue10(){
    var x = 0;
    do {
        print(x)
        x++
    } while (x < 10)
}