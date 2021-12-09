class Day1 {

    fun part1(depths: List<Int>): Int {
        var count = 0
        depths.forEachIndexed { index, depth ->
            if (index != 0 && depth > depths[index - 1]) {
                count += 1
            }
        }
        return count
    }

    fun part2(depths: List<Int>): Int {
        val sumOfThrees = depths.mapIndexed { index, depth ->
            if (index < depths.size - 2) {
                depth + depths[index + 1] + depths[index + 2]
            } else 0
        }.dropLast(2)
        return sumOfThrees.filterIndexed { index, sum ->
            index < sumOfThrees.size - 1 && sum < sumOfThrees[index + 1]
        }.count()
    }

}