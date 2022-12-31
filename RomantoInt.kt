class Solution {
fun romanToInt(s: String): Int {
    val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val numerals = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    var result = 0
    var i = 0
    var j = 0
    while (i < s.length && j < values.size) {
        if (s.startsWith(numerals[j], i)) {
            result += values[j]
            i += numerals[j].length
        } else {
            j++
        }
    }

    return result
}

}