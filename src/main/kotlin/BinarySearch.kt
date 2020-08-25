fun main() {
    val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val numberIndex = binarySearch(4, array)

    print("Number Index: $numberIndex")
}

fun binarySearch(
    searchingNumber: Int,
    array: IntArray
): Int {
    var startIndex = 0
    var endIndex = array.size - 1
    var middleIndex = endIndex / 2

    while (startIndex <= endIndex) {
        if (searchingNumber == array[middleIndex]) return middleIndex

        if (searchingNumber < array[middleIndex]) {
            endIndex = middleIndex - 1
            middleIndex = startIndex + (endIndex - startIndex) / 2
        }

        if (searchingNumber > array[middleIndex]) {
            startIndex = middleIndex + 1
            middleIndex = startIndex + (endIndex - startIndex) / 2
        }
    }

    return -1
}