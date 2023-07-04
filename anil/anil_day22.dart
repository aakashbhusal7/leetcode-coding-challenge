class Solution {
  int minimumCost(List<int> cost) {
    cost.sort((b, a) => a.compareTo(b));
    if (cost.length == 2) return cost[0] + cost[1];
    if (cost.length == 1) return cost[0];
    int total = 0;
    int i = 0;
    int j = 1;
    print(cost);
    while (j <= cost.length - 1) {
      final i1 = cost[i];
      final j1 = cost[j];
      if (j == cost.length - 1) return total = total + i1 + j1;
      final j2 = cost[j + 1];
      if (j2 <= j1) {
        total = total + i1 + j1;
        cost.remove(i1);
        cost.remove(j1);
        cost.remove(j2);
        i = 0;
        j = 1;
      } else {
        j++;
      }
      if (cost.length == 1) total = total + cost[0];
    }
    return total;
  }
}
