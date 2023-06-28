class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs.joinToString("")
        strs.sortBy { it.length }
        val strsList: ArrayList<String> = arrayListOf()
        for (element in strs) {
            strsList.add(element)
        }
        val sortedStrs: Array<String> = strsList.toTypedArray()
        val tempSortString: ArrayList<String> = arrayListOf()
        var tempLength: Int = sortedStrs[0].length
        for (i in 0 until sortedStrs.size - 1) {
            tempSortString.clear()
            for (j in 0 until tempLength) {
                if (sortedStrs[i + 1][j] == sortedStrs[i][j]) {
                    tempSortString.add(sortedStrs[i + 1][j].toString())
                    tempLength = tempSortString.size
                } else {
                    if (tempSortString.isEmpty()) return ""
                    break
                }

            }
        }
        return tempSortString.joinToString(separator = "")
    }
}