package one.digitalinovation.collection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 4500.0
    salarios[2] = 500.0
    salarios.sort()
    salarios.forEach { println(it) }

    println("----------------------")
    salarios.forEachIndexed { index, salario -> salarios[index] = salario * 1.1 }
    salarios.forEach { println(it) }

    println("----------------------")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 895.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}