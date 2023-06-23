class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        if (words.size <= 1) {
            return true
        }
        var orderHashMap: Array<String> = arrayOf()
        orderHashMap = order.map { it.toString() }.toTypedArray()
        for (i in 0 until words.size - 1) {
            val first = words[i]
            val second = words[i + 1]
            var count: Int = 0
            while (true) {
                if (count == first.length) {
                    break
                }
                if (count == second.length) {
                    return false
                }
                if (orderHashMap.indexOf(first[count].toString()) > orderHashMap.indexOf(second[count].toString())) {
                    return false
                }
                if (orderHashMap.indexOf(first[count].toString()) < orderHashMap.indexOf(second[count].toString())) {
                    break
                }
                count++
            }
        }
        return true
    }
}