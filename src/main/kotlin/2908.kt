fun main(){
    var sum = 0
    val n = readLine()
    val numberString: String = readLine()!!
    numberString.forEach {
        sum += Character.getNumericValue(it)
    }
    println(sum)
}