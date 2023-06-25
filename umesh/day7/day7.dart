import 'dart:math';

class Solution {
  int? maximumProduct(List<int> nums) {
    nums.sort();
    int l = nums.length-1;
    return max(
        nums[l] * nums[l - 1] * nums[l - 2], nums[0] * nums[1] * nums[l]);
  }
}

void main() {
  print(Solution().maximumProduct([-100, -1, 1, 2, 3, 4]));
}
