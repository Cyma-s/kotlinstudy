fun main() {
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    numbers.forEach{sum += (it*it)}
    println(sum % 10)
}