package one.digitalinovation.collection

fun main () {
    val values = intArrayOf(2,3,4,1,7,10)
    values.forEach {
        println(it)
    }
    println(" ------------------------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}