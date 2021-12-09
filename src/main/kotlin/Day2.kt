class Day2 {

    fun part1(steps: List<String>): Pair<Int, Int> {
        val directionPositions = steps.map { Pair(it.substringBefore(" "), it.substringAfter(" ").toInt()) }
            .groupingBy { it.first }
            .aggregate { key, sum: Int?, directionPositionPair, isFirst ->
                if (isFirst) directionPositionPair.second
                else sum!!.plus(directionPositionPair.second)
            }

        return Pair(directionPositions["forward"] ?: 0,
            (directionPositions["down"] ?: 0) - (directionPositions["up"] ?: 0)
        )
    }

    fun part2(steps: List<String>): Int {
        var depth = 0
        var aim = 0
        var forward = 0
        steps.map { Pair(it.substringBefore(" "), it.substringAfter(" ").toInt()) }
            .forEach { directionPositionPair ->
                when (directionPositionPair.first) {
                    "forward" -> {
                        forward += directionPositionPair.second
                        depth += directionPositionPair.second * aim
                    }
                    "up" -> {
                        aim -= directionPositionPair.second
                    }
                    else -> {
                        aim += directionPositionPair.second
                    }
                }
            }
        return depth * forward
    }
}