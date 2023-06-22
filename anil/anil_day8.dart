class Solution {
  int searchInsert(List<int> nums, int target) {
    int index = 0;
    for (var i = 0; i < nums.length; i++) {
      if (nums[i] == target) return i;
      if (i == 0 && target < nums[i]) return 0;
      if (nums[i] < target) {
        index = i;
      }
    }
    return index + 1;
  }
}
