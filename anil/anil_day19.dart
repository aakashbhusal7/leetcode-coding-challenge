class Solution {
  String makeGood(String s) {
    List<String> list = s.split("");
    int i = 0;
    while (i < list.length - 1 && i >= 0) {
      final l1 = list[i];
      final l2 = list[i + 1];
      final l1Lower = l1.toLowerCase();
      final l1Upper = l1.toUpperCase();
      final l2Lower = l1.toLowerCase();
      final l2Upper = l1.toUpperCase();
      if ((l1Lower == l1 && l2Upper == l2 && l1Lower == l2Lower) ||
          (l2Lower == l2 && l1Upper == l1 && l1Lower == l2Lower)) {
        list.removeAt(i + 1);
        list.removeAt(i);
        i = i - 1;
        if (i < 0) i = 0;
        continue;
      }
      i++;
    }
    return list.join();
  }
}
