package aakash.day6

class `day-6-duplicate-array` {
    fun containsDuplicate(nums: IntArray): Boolean {
        return !nums.distinct().toIntArray().contentEquals(nums)
    }
}