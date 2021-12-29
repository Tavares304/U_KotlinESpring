package fundamentos

fun main() {

    var nome: String? = null

    // !! fala pro codigo que eu tenho certeza de que nao vai ser nullo
    println(nome?.length) //? permite tornar a variavel null. Caso use metodos em sequencia devo usar o safecall (?) para todos


    var nome2: String? =  null
    var tamanho: Int = nome2?.length ?: 0 // elvis operator

    print(tamanho)

    var listaComElementosNull: List<Int?> = listOf(1, 2, null)
    var listaNullable: List<Int>? = null

}