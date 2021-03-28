package one.digitalinovation.collection

fun main() {
    val nome = Array(size = 3) {""}
    nome[0]="Maria"
    nome[1]="João"
    nome[2]="José"
    for (nomes in nome){
        println(nomes)
    }
    println("----------------------------")
    nome.sort()
    nome.forEach { println(it) }

    println("----------------------------")
    val nomes2 = arrayOf("Maria", "Zaza", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}