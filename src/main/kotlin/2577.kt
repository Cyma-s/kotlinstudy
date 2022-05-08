import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val count = Array(10) { 0 }
    val a = nextInt(); val b = nextInt(); val c = nextInt();
    (a * b * c).toString().forEach { count[Character.getNumericValue(it)]++ }
    count.forEach { println(it) }
}