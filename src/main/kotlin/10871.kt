import java.util.Scanner
fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val n = nextInt(); val x = nextInt()
    for (i in 1..n) {
        val num = nextInt()
        if (num < x) print("$num ")
    }
}