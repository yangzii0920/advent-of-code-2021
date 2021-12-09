class Day3 {

    fun part1(report: List<String>): Pair<Int, Int> {
        var gamma = ""
        var epsilon = ""
        report.first().forEachIndexed { index, _ ->
            val count = report.groupingBy { it[index] }.eachCount()
            gamma += count.maxByOrNull { it.value }!!.key
            epsilon += count.minByOrNull { it.value }!!.key
        }
        return Pair(gamma.toInt(2), epsilon.toInt(2))
    }

}