class Solution {
    fun maxArea(height: IntArray): Int {
        var finalArea: Int = 0
        var start: Int = 0
        var end: Int = height.size - 1
        while (start < end) {
            val startPoint = height[start]
            val endPoint = height[end]
            val tempArea = if (startPoint >= endPoint) {
                endPoint * (end - start)
            } else {
                startPoint * (end - start)
            }
            if (tempArea > finalArea) finalArea = tempArea
            if (startPoint > endPoint) {
                end--
            } else {
                start++
            }
        }
        return finalArea
    }
}