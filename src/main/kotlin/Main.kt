import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val a:Int = sc.next().reversed().toInt()
    val b:Int = sc.next().reversed().toInt()
    if (a > b) println(a)
    else println(b)
}