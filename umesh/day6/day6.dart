class Solution {
  bool containsDuplicate(List<int> nums) {
    List<int> compareList = [];
    compareList.addAll(nums);
    for (int i = 0; i < nums.length; i++) {
      compareList.remove(nums[i]);
      if (compareList.contains(nums[i])) {
        return true;
      }
    }
    return false;
  }
}

void main() {
  print(Solution().containsDuplicate([1, 2, 3, 4]));
}
