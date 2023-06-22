class Solution {
  bool canPlaceFlowers(List<int> flowerbed, int n) {
    for (int i = 0; i < flowerbed.length && n > 0; i++) {
      if (flowerbed[i] == 0 &&
          (i == 0 || flowerbed[i - 1] == 0) &&
          (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
        n--;
        i++;
      }
    }
    return n == 0;
  }
}
