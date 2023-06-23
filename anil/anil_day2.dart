class Solution {
  int maxProfit(List<int> prices) {
    int profit = 0;
    int buy = prices[0];
    for (int i = 1; i <= prices.length - 1; i++) {
      int current = prices[i];
      final deff = current - buy;
      if (current <= buy) {
        buy = current;
        continue;
      } else if (current > buy && deff > profit) {
        profit = current - buy;
      }
    }
    return profit;
  }
}
