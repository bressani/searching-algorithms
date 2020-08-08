import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RecursiveBinarySearchKtTest {

    @ParameterizedTest
    @MethodSource("provide test arguments for recursiveSearch")
    fun `test recursiveSearch`(expected: Int, array: IntArray, searchNumber: Int) {
        val actual = recursiveBinarySearch(searchNumber, array)

        assertEquals(expected, actual)
    }

    fun `provide test arguments for recursiveSearch`(): Stream<Arguments> =
            Stream.of(
                    Arguments.of(1, intArrayOf(1, 2), 2),
                    Arguments.of(3, intArrayOf(1, 2, 4, 7, 10), 7),
                    Arguments.of(3, intArrayOf(0, 6, 7, 9), 9),
                    Arguments.of(0, intArrayOf(1, 2, 4, 9), 1),
                    Arguments.of(0, intArrayOf(1), 1),
                    Arguments.of(-1, intArrayOf(1, 2), 3),
                    Arguments.of(-1, intArrayOf(1, 5, 10, 20), 15),
                    Arguments.of(-1, intArrayOf(0), 15)
            )
}