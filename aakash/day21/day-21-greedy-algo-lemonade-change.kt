class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var fiveChangeCount: Int = 0
        var tenChangeCount: Int = 0
        for (i in bills.indices) {
            if (bills[i] == 5) {
                fiveChangeCount++
            } else if (bills[i] == 10) {
                fiveChangeCount--
                tenChangeCount++
                if (fiveChangeCount < 0) {
                    return false
                } else {
                    continue
                }
            } else {
                if (tenChangeCount >= 1) {
                    tenChangeCount--
                    fiveChangeCount--
                } else fiveChangeCount -= 3
                if (fiveChangeCount < 0) {
                    return false
                } else {
                    continue
                }
            }
        }
        return true
    }
}