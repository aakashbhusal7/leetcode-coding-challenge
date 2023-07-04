class Solution {
  bool checkRecord(String s) {
    final late = s.contains("LLL");
    final absent = s.indexOf("A") != s.lastIndexOf("A");
    return (late || absent) ? false : true;
  }
}
