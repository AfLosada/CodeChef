package ChefAndString

fun main() {
    val testCases = readln().toInt()
    for (i in 1..testCases) {
        val S = readln()
        val vExists = rightShift(S) == leftShift(S)
        if(vExists){
            println("YES")
        }
        else{
            println("NO")
        }
    }
}

fun rightShift(string: String): String {
    return string.last() + string.substring(0, string.length - 1)
}

fun leftShift(string: String): String {
    return string.substring(1) + string.first()
}