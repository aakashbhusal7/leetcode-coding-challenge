class Solution {
  List<String> findRestaurant(List<String> l1, List<String> l2) {
    List<String> cl = [];
    int le = 0;
    for (var i = 0; i <= l1.length - 1; i++) {
      for (var j = 0; j <= l2.length - 1; j++) {
        bool same = l1[i] == l2[j];
        if (same && cl.isEmpty) {
          cl.add(l1[i]);
          le = i + j;
        } else if (same && (i + j) < le) {
          cl = [l1[i]];
        } else if (same && (i + j) == le) {
          cl.add(l1[i]);
        }
      }
    }
    return cl;
  }
}
