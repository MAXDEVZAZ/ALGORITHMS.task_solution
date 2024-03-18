package yandex_5.contest_3

fun main() {
    val inputListOne = readln().split(" ")
    val inputListTwo = readln().split(" ").toMutableList()
    val resultList = mutableListOf<String>()

    for (i in 0..<inputListTwo.size) {
        resultList.add(i, inputListTwo[i])
        for (element in inputListOne) {
            if (inputListTwo[i].startsWith(element) && resultList[i].length > element.length) {
                resultList[i] = element
            }
        }
    }
    print(resultList.joinToString(" "))
}