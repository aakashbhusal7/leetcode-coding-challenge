package aakash.day3

class `day-3-cookies` {

    class Solution {
        fun findContentChildren(g: IntArray, s: IntArray): Int {
            var count: Int = 0
            g.sort()
            s.sort()
            for (i in 0 until s.size) {
                if (s[i] >= g[count]) {
                    count++
                }
                if (count == g.size) return count
            }
            return count
        }
    }
}