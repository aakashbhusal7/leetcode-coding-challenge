class Solution {
  int maxProfit(List<int> prices) {
    int maxProfit = 0;
    int ;
    for (int i = prices.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (prices[i] > prices[j]) {
          int diff = prices[i] - prices[j];
          if (diff > maxProfit) {
            maxProfit = diff;
          }
        }
      }
    }

    return maxProfit;
  }
}

main() {
  int max = Solution().maxProfit([
    553,
    948,
    857,
    491,
    622,
    162,
    934,
    66,
    486,
    569,
    690,
    596,
    506,
    452,
    635,
    690
  ]);
  print("max profit = " + max.toString());
}
