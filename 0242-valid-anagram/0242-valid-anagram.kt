class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sArray:List<Char> = s.toList()
        val tArray:List<Char> = t.toList()
        val sDictionary= sArray.groupBy{it}.mapValues{it.value.count()}
        val tDictionary= tArray.groupBy{it}.mapValues{it.value.count()}
        if(sDictionary.size !=tDictionary.size){
            return false
        }
        var isAnagram:Boolean = true
        sDictionary.forEach{(key,value)->
            if(tDictionary[key] !=sDictionary[key]){
                isAnagram= false
            }
        }
        return isAnagram
    }
}