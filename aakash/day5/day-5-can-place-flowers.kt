package aakash.day5

class `day-5-can-place-flowers` {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count: Int = 0
        var tempArray = flowerbed
        for (i in tempArray.indices) {
            if (flowerbed[i] == 0) {
                if (tempArray.size == 1 && tempArray[0] == 0) {
                    count++
                    break
                } else if (i == 0 && tempArray[i + 1] == 0) {
                    count++
                    tempArray[i] = 1
                    continue
                } else if (i == tempArray.size - 1 && tempArray[i - 1] == 0) {
                    count++
                    continue
                }
                if (i != 0 && tempArray[i - 1] == 0 && tempArray[i + 1] == 0) {
                    count++
                    tempArray[i] = 1
                }
            }
        }
        return count >= n
    }
}