package fundamentos

class Pessoa(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Nome ${nome}, idade ${idade}"
    }

}

fun main() {
    var henrique =  Pessoa("Henrique", 31)
    println(henrique.toString())
}