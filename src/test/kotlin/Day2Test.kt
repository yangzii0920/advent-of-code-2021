import org.junit.jupiter.api.Test
import java.io.File

internal class Day2Test {

    @Test
    fun `part 1 - multiply the horizontal and depth positions`() {
        val steps = File("src/main/resources/day2_part1.input").readLines()

        val positions = Day2().part1(steps)

        println("horizontal position at ${positions.first} and depth at ${positions.second} which product is ${positions.first.times(positions.second)}")
    }

    @Test
    fun `part 2 - multiply the horizontal and depth positions`() {
        val steps = File("src/main/resources/day2_part2.input").readLines()

        val product = Day2().part2(steps)

        println(product)
    }
}