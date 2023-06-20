import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.max

class `day-8-array-insert` {
    class Solution {
        fun searchInsert(nums: IntArray, target: Int): Int {
            var index:Int=nums.size
            for(i in nums.indices){
                if(nums[i]==target){
                    index= i
                    break
                }
                else if(target<nums[i]){
                    index=i
                    break
                }
            }
            return index
        }
    }
}