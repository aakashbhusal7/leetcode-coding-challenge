class Solution {
  bool isPalindrome(String s) {
    final List<String> ls = s.toLowerCase().split("");
    int i = 0;
    int j = ls.length - 1;
    final regex = RegExp(r'[0-9a-z]');
    while (i < j) {
      final valid1 = ls[i].contains(regex);
      final valid2 = ls[j].contains(regex);
      if (!valid1 && valid2)
        i++;
      else if (!valid2 && valid1)
        j--;
      else if (!valid1 && !valid2) {
        i++;
        j--;
      } else {
        if (ls[i] != ls[j]) return false;
        i++;
        j--;
      }
    }
    return true;
  }
}
