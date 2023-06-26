class Solution {
  int romanToInt(String s) {
    int result = 0;
    Map<String, int> romonMap = {};
    romonMap['I'] = 1;
    romonMap['V'] = 5;
    romonMap['X'] = 10;
    romonMap['L'] = 50;
    romonMap['C'] = 100;
    romonMap['D'] = 500;
    romonMap['M'] = 1000;
    for (var i = 0; i < s.length; i++) {
      if (i == s.length - 1) {
        result += romonMap[s[i]]!;
      } else if (romonMap[s[i]]! < romonMap[s[i + 1]]!) {
        result -= romonMap[s[i]]!;
      } else {
        result += romonMap[s[i]]!;
      }
    }
    return result;
  }
}
