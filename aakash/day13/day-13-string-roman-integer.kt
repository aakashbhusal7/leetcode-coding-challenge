class Solution {
    fun romanToInt(s: String): Int {
        var sum: Int = 0
        var i: Int = 0
        while (i < s.length) {
            if (i != s.length - 1 &&
                (s[i] == 'I' && s[i + 1] == 'V' || s[i] == 'I' && s[i + 1] == 'X' ||
                        s[i] == 'X' && s[i + 1] == 'L' || s[i] == 'X' && s[i + 1] == 'C' ||
                        s[i] == 'C' && s[i + 1] == 'D' || s[i] == 'C' && s[i + 1] == 'M')
            ) {
                sum += getDoubleNumber(s[i], s[i + 1])
                i += 2
            } else {
                sum += getNumber(s[i])
                i++
            }
        }
        return sum
    }

    private fun getDoubleNumber(char1: Char, char2: Char): Int {
        return when (char1.toString().plus(char2.toString())) {
            "IV" -> 4
            "IX" -> 9
            "XL" -> 40
            "XC" -> 90
            "CM" -> 900
            "CD" -> 400
            else -> getNumber(char1)
        }

    }

    private fun getNumber(char1: Char): Int {
        return when (char1.toString()) {
            "I" -> 1
            "V" -> 5
            "X" -> 10
            "L" -> 50
            "C" -> 100
            "D" -> 500
            "M" -> 1000
            else -> 1
        }

    }
}