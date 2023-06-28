class Solution {
  bool checkRecord(String s) {
    final sl = s.split("");
    int c1 = 0;
    int c2 = 0;
    for (var i = 0; i < sl.length; i++) {
      final a = sl[i];
      if (a == 'P') {
        c2 = 0;
        continue;
      } else if (a == "L") {
        c2++;
        if (c2 > 2) return false;
      } else {
        c2 = 0;
        c1++;
        if (c1 >= 2) return false;
      }
    }
    return true;
  }
}
