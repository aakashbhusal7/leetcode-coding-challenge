class Solution {
  bool isPalindrome(int x) {
    final List<String> characterList = x.toString().split('');
    for (int i = 0; i <= characterList.length - 1; i++) {
      if (characterList[i] != characterList[characterList.length - 1 - i])
        return false;
    }
    return true;
  }
}
