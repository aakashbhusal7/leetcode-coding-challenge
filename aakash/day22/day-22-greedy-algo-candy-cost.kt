class Solution {
    fun minimumCost(cost: IntArray): Int {
        if (cost.size == 1) {
            return cost[0]
        } else if (cost.size < 3) {
            return cost[0] + cost[1]
        }
        cost.sortDescending()
        var sum: Int = 0
        val tempArr: IntArray = cost
        var i: Int = 0
        while (i + 1 <= tempArr.size) {
            if (i == tempArr.size - 1) {
                sum += tempArr[i]
                i++
            } else {
                sum += tempArr[i] + tempArr[i + 1]
                i += 3
            }
        }
        return sum
    }

}