class Solution {
  bool canPlaceFlowers(List<int> flowerbed, int n) {
    int possibleCount = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (isSelfPrevAndNextEmpty(flowerbed[i], i == 0 ? null : flowerbed[i - 1],
          i == flowerbed.length - 1 ? null : flowerbed[i + 1])) {
        possibleCount++;
        i++;
      }
    }
    return (possibleCount >= n);
  }

  bool isSelfPrevAndNextEmpty(int current, int? prev, int? next) {
    if (current == 1)
      return false;
    else {
      if (prev == null) {
        return next == 1 ? false : true;
      } else if (prev == 0 && next == 0) {
        return true;
      } else if (next == null) {
        return prev == 0 ? true : false;
      } else {
        return false;
      }
    }
  }
}

void main() {
  bool data = Solution().canPlaceFlowers([0], 1);
  print("can plot = " + data.toString());
}
