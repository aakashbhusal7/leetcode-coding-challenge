import 'dart:math';

class Solution {
  int maxArea(List<int> h) {
    int left = 0;
    int right = h.length - 1;
    int maximum = 0;
    while (left < right) {
      int h1 = h[left];
      int h2 = h[right];
      int width = right - left;
      int height = min(h1, h2);
      int area = height * width;
      maximum = max(maximum, area);
      if (h1 < h2)
        left++;
      else if (h1 > h2)
        right--;
      else {
        left++;
        right--;
      }
    }
    return maximum;
  }
}
