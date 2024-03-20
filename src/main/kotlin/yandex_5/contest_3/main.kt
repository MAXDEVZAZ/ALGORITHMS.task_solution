package yandex_5.contest_3

fun main() {
    var quanity = readln().toInt()
    var dist = mutableListOf<Int>()
    var input = mutableListOf<MutableList<Int>>()
    for (i in 0..<quanity) {
        input.add(mutableListOf())
        input[i] = readln().split(" ").map { it.toInt() } as MutableList<Int>
    }
    for (i in 0..<input.size) {
        for (j in 0..1) {
            if (!dist.contains(input[i][j])) {
                dist.add(input[i][j])
            }
        }
    }

}