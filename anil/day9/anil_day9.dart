class Solution {
  int islandPerimeter(List<List<int>> grid) {
    int count = 0;
    for (var i = 0; i < grid.length; i++) {
      for (var j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0)
          continue;
        else {
          if (i == 0) {
            count++;
          } else {
            if (grid[i - 1][j] != 1) count++;
          }
          if (j == 0)
            count++;
          else {
            if (grid[i][j - 1] != 1) count++;
          }
          if (i == grid.length - 1)
            count++;
          else {
            if (grid[i + 1][j] != 1) count++;
          }
          if (j == grid[i].length - 1)
            count++;
          else {
            if (grid[i][j + 1] != 1) count++;
          }
        }
      }
    }
    return count;
  }
}
