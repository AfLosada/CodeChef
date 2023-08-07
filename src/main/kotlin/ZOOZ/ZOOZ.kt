fun main(args: Array<String>) {
    val testCases = readln().toInt()
    for (i in 1..testCases) {
        val length = readln().toInt()
        println(getBinaryString(length))
    }
}

fun getBinaryString(length: Int): String {
    val firstHalf = List(length / 2) { (it + 1) % 2 }
    return if (firstHalf.size * 2 < length) firstHalf.joinToString("") + (firstHalf[firstHalf.size - 1] + 1) % 2 + firstHalf.joinToString(
        ""
    ).reversed()
    else firstHalf.joinToString("") + firstHalf.joinToString("").reversed()
}


