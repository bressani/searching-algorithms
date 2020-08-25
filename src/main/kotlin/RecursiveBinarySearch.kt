fun main() {
    val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val numberIndex = recursiveBinarySearch(10, array)

    print("Number Index: $numberIndex")
}

fun recursiveBinarySearch(
    searchingNumber: Int,
    array: IntArray,
    startIndex: Int = 0,
    endIndex: Int = array.size - 1
): Int {
    val middleIndex: Int = startIndex + (endIndex - startIndex) / 2

    if (searchingNumber == array[middleIndex]) return middleIndex

    if (startIndex == endIndex) return -1

    if (searchingNumber < array[middleIndex]) return recursiveBinarySearch(
        searchingNumber,
        array,
        endIndex = middleIndex
    )

    if (searchingNumber > array[middleIndex]) return recursiveBinarySearch(
        searchingNumber,
        array,
        startIndex = middleIndex + 1
    )

    return -1
}