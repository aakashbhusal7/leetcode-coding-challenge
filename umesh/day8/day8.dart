class Solution {
  int searchInsert(List<int> nums, int target) {
    if (target < nums[0] || target == nums[0]) {
      return 0;
    } else if (target > nums.last) {
      return nums.length;
    } else if (target == nums.last) {
      return nums.length-1;
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (target == nums[i]) {
          return i;
        } else if (target > nums[i] && target < nums[i + 1]) {
          return i + 1;
        }
      }
    }
    return 0;
  }
}

void main() {
  print(Solution().searchInsert([1, 3, 5, 6], 7).toString());
}
