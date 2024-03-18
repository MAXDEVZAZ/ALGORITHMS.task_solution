package yandex_5.contest_3

fun main() {
    val inputListOne = readln().split(" ")
    val inputListTwo = readln().split(" ")
    for (i in inputListTwo.indices) {
        var result = inputListTwo[i]
        for (element in inputListOne) {
            if (inputListTwo[i].startsWith(element) && result.length > element.length) {
                result = element
            }
        }
        print(result)
        if (i != inputListTwo.size - 1) {
            print(" ")
        }
    }
}