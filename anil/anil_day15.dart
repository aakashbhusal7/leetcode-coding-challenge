import 'dart:collection';

class Solution {
  bool isIsomorphic(String s, String t) {
    final sl = s.split("");
    final tl = t.split("");
    HashMap<String, String> buffer = HashMap<String, String>();
    HashMap<String, bool> used = HashMap<String, bool>();
    for (var i = 0; i < sl.length; i++) {
      final c1 = sl[i];
      final c2 = tl[i];
      if (buffer.containsKey(c1)) {
        if (buffer[c1] != c2) return false;
      } else {
        if (used.containsKey(c2)) return false;
        buffer.addAll({c1: c2});
        used.addAll({c2: true});
      }
    }
    return true;
  }
}
