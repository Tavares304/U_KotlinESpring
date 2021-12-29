package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object { //util para criar builders???
        fun criarMinhaClasse(): MinhaClasse {
            return  MinhaClasse("Henrique", "Rua teste", 31)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criarClasse(): SegundaClasse {
        return  SegundaClasse("Henrique", "Rua teste", 31)
    }
}

fun main() {

   //var segundaClasse = SegundaClasse().criarClasse() //da erro se nao criar com algo dentro do construtor

    var minhaClasse = MinhaClasse.criarMinhaClasse() // so nao tem os parenteses? pegar o qu eu declarei sem precisar por nada ficticio

}