package fundamentos

fun main() {

    var lista = listOf(1, 2, 3, 4, 5, 6, 7) // nao preciso do : List<Int>
    // lista.remove(3) lista imutavel
    var listaMutavel = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    println(listaMutavel)
    listaMutavel.add(666)
    println(listaMutavel)
    listaMutavel[0] = 999 // consigo sobrescrever um item da lista
    println(listaMutavel)

    val pares = lista.filter { it % 2 == 0 } // ocorre uma iteracao e o it é a iteracao da vez, como um contador de um for each

    println(pares)

    lista.forEach {
        println(it)
    }


    var setNumeros = setOf(1,2,3,4,5,2) // tem o mutableSetOf() assim como o list e nao repete valores
    println(setNumeros.shuffled())


    var mapNomeIdade = mapOf("Lucifer" to 666, "MoU" to 7) //tbm tem o mutableMapOf() e no lugar de add é o put
    println(mapNomeIdade)
}