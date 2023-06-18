import 'dart:math';

class Solution {
  int maximumProduct(List<int> nums) {
    nums.sort();
    final l = nums.length - 1;
    return max(
        nums[0] * nums[1] * nums[l], nums[l] * nums[l - 1] * nums[l - 2]);
  }
}
