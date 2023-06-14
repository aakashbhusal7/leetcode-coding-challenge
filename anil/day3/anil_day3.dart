class Solution {
  int findContentChildren(List<int> g, List<int> s) {
    g.sort();
    s.sort();
    int satisfiedChild = 0;
    int checkedCookie = 0;
    while (satisfiedChild < g.length && checkedCookie < s.length) {
      if (s[checkedCookie] >= g[satisfiedChild]) {
        satisfiedChild++;
      }
      checkedCookie++;
    }
    return satisfiedChild;
  }
}
