class Solution {
    fun isPalindrome(x: Int): Boolean {
        var rev: Int = 0
        var rem: Int = 0
        var tempValue: Int = x
        if (x < 0) return false
        for (i in 0 until x.toString().length) {
            rem = tempValue % 10
            rev = rev * 10 + rem
            tempValue = tempValue / 10
        }
        return x == rev;
    }
}



