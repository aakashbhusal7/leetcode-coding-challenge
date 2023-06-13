package aakash.day2

class `aakash-day2-stock-challenge` {

    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxPrice = 0
        var profit = 0
        for (i in prices.indices) {
            if (prices[i] <= minPrice) {
                minPrice = prices[i]
            } else {
                maxPrice = prices[i]
                if (maxPrice - minPrice > profit) {
                    profit = maxPrice - minPrice
                }
            }
        }
        return if (maxPrice == 0) 0 else profit
    }
}