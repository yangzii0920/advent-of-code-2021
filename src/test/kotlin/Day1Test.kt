import org.junit.jupiter.api.Test
import java.io.File

internal class Day1Test {

    @Test
    fun `part 1 - count the number of measurements larger than the previous measurement`() {
        val depths = File("src/main/resources/day1_part1.input").readLines().map { it.toInt() }

        val count = Day1().part1(depths)

        println(count)
    }

    @Test
    fun `part 2 - count the number of sums larger than the previous sum considering sums of a three-measurement sliding window`() {
        val depths = File("src/main/resources/day1_part2.input").readLines().map { it.toInt() }

        val count = Day1().part2(depths)

        println(count)
    }
}
