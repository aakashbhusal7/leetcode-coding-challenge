class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        val wordCount:ArrayList<Int> = arrayListOf()
        for(i in 0 until sentences.size){
            var count:Int=0
            val parts= sentences[i].split("\\s".toRegex())
            val partsSize= parts.size
            wordCount.add(partsSize)
        }
       return wordCount.max()
    }
}