class Solution {
  bool isAlienSorted(List<String> words, String order) {
    final o = order.split("");

    for (var i = 0; i < words.length - 1; i++) {
      final f1 = words[i].split("");
      final f2 = words[i + 1].split("");
      int j = 0;
      while (j < f1.length && j < f2.length) {
        if (f1[j] == f2[j]) {
          if (j == f2.length - 1 && f1.length > f2.length) {
            return false;
          } else {
            j++;
            continue;
          }
        }
        final i1 = o.indexOf(f1[j]);
        final i2 = o.indexOf(f2[j]);
        if (i1 > i2) {
          return false;
        } else
          break;
      }
    }
    return true;
  }
}
