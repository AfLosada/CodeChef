package BeautifulArray

import java.util.*
import kotlin.math.min

fun main() {
    val testCases = readln().toInt()
    for (i in 1..testCases) {
        val amountOfNumbers = readln().toInt()
        val scanner = Scanner(System.`in`)
        val positionModulusMap = hashMapOf<Int, MutableList<Int>>(
            0 to mutableListOf(), 1 to mutableListOf(), 2 to mutableListOf(), 3 to mutableListOf()
        )
        for (j in 1..amountOfNumbers) {
            val number = scanner.nextInt()
            positionModulusMap[number % 4]!!.add(number)
        }

        val missing1 = positionModulusMap[1]!!
        val missing2 = positionModulusMap[2]!!
        val missing3 = positionModulusMap[3]!!

        var answer = 0

        var amountOfMissing1 = missing1.size
        var amountOfMissing2 = missing2.size
        var amountOfMissing3 = missing3.size

        val minimumMissingOf1sAnd3S = min(amountOfMissing1, amountOfMissing3)

        amountOfMissing1 -= minimumMissingOf1sAnd3S
        amountOfMissing3 -= minimumMissingOf1sAnd3S

        answer += minimumMissingOf1sAnd3S

        if(amountOfMissing1 % 2 == 1 || amountOfMissing3 % 2 == 1) {
            println(-1)
        }
        else {
            answer += (amountOfMissing1/2 + amountOfMissing3/2)
            amountOfMissing2 += (amountOfMissing1/2 + amountOfMissing3/2)
            if(amountOfMissing2 % 2 == 1){
                println(2)
            }
            else {
                answer += amountOfMissing2 / 2
                println(answer)
            }
        }

    }
}