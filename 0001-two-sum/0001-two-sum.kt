class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         var output: IntArray = intArrayOf()
        for (i in 0 until nums.size) {
           //if(Math.abs(nums[i])>target) continue
            for(j in 0 until i){
                if(nums[i]+nums[j]==target){
                    output= intArrayOf(i,j)
                    break
                }
            }
        }
        return output
    }
}