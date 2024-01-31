class Solution {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
         var tempGlassTravel: Int = 0
        var tempMetalTravel: Int = 0
        var tempPaperTravel: Int = 0
        var glassSize: Int = 0
        var metalSize: Int = 0
        var paperSize: Int = 0
        for (i in 0 until garbage.size) {
            val glassCount = garbage[i].count { ch -> ch == 'G' }
            val paperCount = garbage[i].count { ch -> ch == 'P' }
            val metalCount = garbage[i].count { ch -> ch == 'M' }
            if (garbage[i].contains('G')) {
                if (i == 0) {
                    glassSize += garbage[i].count { ch -> ch == 'G' }
                } else {
                    glassSize += garbage[i].count { ch -> ch == 'G' } + tempGlassTravel + travel[i - 1]
                    tempGlassTravel = 0
                }
            } else {
                if (i != 0) {
                    tempGlassTravel += travel[i - 1]
                }
            }

            if (garbage[i].contains('P')) {
                if (i == 0) {
                    paperSize += garbage[i].count { ch -> ch == 'P' }
                } else {
                    paperSize += garbage[i].count { ch -> ch == 'P' } + tempPaperTravel + travel[i - 1]
                    tempPaperTravel = 0
                }
            } else {
                if (i != 0) {
                    tempPaperTravel += travel[i - 1]
                }
            }

            if (garbage[i].contains('M')) {
                if (i == 0) {
                    metalSize += garbage[i].count { ch -> ch == 'M' }
                } else {
                    metalSize += garbage[i].count { ch -> ch == 'M' } + tempMetalTravel + travel[i - 1]
                    tempMetalTravel = 0
                }
            } else {
                if (i != 0) {
                    tempMetalTravel += travel[i - 1]
                }
            }

        }
        return glassSize + metalSize + paperSize
    }
}