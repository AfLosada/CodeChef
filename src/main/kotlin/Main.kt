import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val testCases = sc.nextInt()
    sc.nextLine()
    for (i in 0 until testCases) {
        val names = sc.nextLine()
        val splitNames = names.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val man = splitNames[0]
        val woman = splitNames[1]
        println(isASequenceOf(man, woman))
    }
}


fun isASequenceOf(subsequence: String, sequence: String): Boolean {
    var isASequence = false
    val probableSubSequences = findAllPositionsOfLettersInString(subsequence[0], sequence)
    var currentSubSequence = 0
    while (currentSubSequence < probableSubSequences.size && !isASequence) {
        var commonSequence = "" + subsequence[0]
        val sequenceStartPosition = probableSubSequences[currentSubSequence]
        var i = 1
        while (i < subsequence.length && !isASequence) {
            val currentLetter = subsequence[i]
            val letterInOtherStringPosition =
                findLetterPositionInString(currentLetter, sequence, sequenceStartPosition)
            if (letterInOtherStringPosition == -1) {
                break
            }
            commonSequence += currentLetter
            if (commonSequence == subsequence) {
                isASequence = true
            }
            i++
        }
        currentSubSequence++
    }
    return isASequence
}

fun findLetterPositionInString(letter: Char, sequence: String, startPosition: Int): Int {
    var result = -1
    var i = startPosition
    while (i < sequence.length && result == -1) {
        val currentLetter = sequence[i]
        if (letter == currentLetter) {
            result = i
        }
        i++
    }
    return result
}

fun findAllPositionsOfLettersInString(letter: Char, sequence: String): ArrayList<Int> {
    val positions = ArrayList<Int>()
    for (i in sequence.indices) {
        val current = sequence[i]
        if (current == letter) {
            positions.add(i)
        }
    }
    return positions
}
