class Solution {
  String convertToTitle(int columnNumber) => columnNumber == 0
      ? ''
      : convertToTitle((columnNumber - 1) ~/ 26) +
          (String.fromCharCode((columnNumber - 1) % 26 + 65));
}
