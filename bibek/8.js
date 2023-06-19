var searchInsert = (nums, target) => ((nums.sort((a, b) => a - b).findIndex(x => x >= target) + 1) || nums.length + 1) - 1;
