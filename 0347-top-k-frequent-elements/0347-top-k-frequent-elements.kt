class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
       var numDictionary: Map<Int, Int> = TreeMap()
        numDictionary = nums.groupBy { it }.mapValues { it.value.count() }
        val sortedList = numDictionary.entries.sortedByDescending { it.value }
        val sortedDictionary=LinkedHashMap<Int,Int>()
        sortedList.forEach {entry ->
            sortedDictionary[entry.key] = entry.value
        }
        val topKeys: ArrayList<Int> = arrayListOf()
        var count:Int=0
        for(key in sortedDictionary.keys){
            if(count<k){
            topKeys.add(key)
            count++
            }
        }
        return topKeys.toIntArray()
    }
}