import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val t = nextInt()
    for (i in 1..t) {
        val r = nextInt(); val s = next()
        s.forEach {
            for (j in 1..r) {print(it)}
        }
        println()
    }
}