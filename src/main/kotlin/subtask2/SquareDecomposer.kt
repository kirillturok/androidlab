package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        return getSquares(number, square(number))
    }

    private fun square(i:Int): Long = (i.toLong() * i.toLong())

    private fun getSquares(number: Int, total: Long): Array<Int>? {
        for (i in number - 1 downTo 1) {
            if (square(i) == total)
                return Array(1) { i }

            val diff = total - square(i)
            if (diff > 0) {
                val arr = getSquares(i, diff)
                if (arr != null) return arr.plus(i)
            }
        }
        return null
    }
}
