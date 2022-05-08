fun main() {
    var max = 0; var index = 0
    val arr = Array<Int>(9) { readLine()!!.toInt() }
    arr.forEach { if (max < it) { max = it } }
    println(max)
    println(arr.indexOf(max) + 1)
}