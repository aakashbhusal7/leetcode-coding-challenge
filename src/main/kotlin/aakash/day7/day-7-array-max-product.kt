package aakash.day7

import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.max

class `day-7-array-max-product` {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        val product1 = nums[0] * nums[1] * nums[nums.size - 1]
        val product2 = nums[nums.size - 3] * nums[nums.size - 2] * nums[nums.size - 1]
        return if (product1 > product2) product1 else product2
    }
}