class Solution {
  int searchInsert(List<int> nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }
    for (int i = 1; i < nums.length; i++) {
      if (target > nums[i - 1] && target < nums[i]) {
        return i;
      }
    }
    if (nums.length == 0 || target < nums[0]) {
      return 0;
    } else {
      return nums.length;
    }
  }
}
