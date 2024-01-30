class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numDictionary= nums.groupBy{it}.mapValues{it.value.count()}
        var count:Int=0
        numDictionary.forEach{(key,value)->
            if(value>1){
                count++
            }
        }
        if(count>=1)return true else return false
    }
}