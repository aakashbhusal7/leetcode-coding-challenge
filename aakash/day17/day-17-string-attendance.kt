class Solution {
    fun checkRecord(s: String): Boolean {
        var absentCount: Int = 0
        var lateCount: Int = 0
        for (i in s.indices) {
            if (s[i] == 'A') {
                absentCount++
                if (absentCount >= 2) return false
            }
            if (s[i] == 'L') {
                lateCount++
                if (lateCount >= 3) return false
            } else {
                lateCount = 0
            }
        }
        return true
    }
}