package aakash.day4

class `day-4-array-sum` {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val arrayFinal: ArrayList<String> = arrayListOf()
        val countArrayHashMap: HashMap<String, Int> = HashMap()
        for (i in list1.indices) {
            for (j in list2.indices) {
                if (list1[i] == list2[j]) {
                    countArrayHashMap[list1[i]] = i + j
                }
            }
        }
        val result = countArrayHashMap.toList().sortedBy { (_, value) -> value }.toMap()
        arrayFinal.add(countArrayHashMap.keys.first())
        result.map { (key, value) ->
            if (value == result.values.first()) {
                arrayFinal.add(key)
            } else {
                arrayFinal.remove(key)
            }
        }
        return arrayFinal.distinct().toTypedArray()
    }
}