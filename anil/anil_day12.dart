class Solution {
  String longestCommonPrefix(List<String> strs) {
    String common = strs.first;
    for (final c in strs) {
      while (!c.startsWith(common)) {
        common = common.substring(0, common.length - 1);
      }
    }
    return common;
  }
}
