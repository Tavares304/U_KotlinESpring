package fundamentos

class Carro(val cor: String, val anoFabricacao: Int, val dono: Dono) {

}

class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Henrique", 31))

    print(carro.dono.nome + "\n")

    var pessoa = Pessoa("Patricia", 71)

    println(pessoa.toString())
}