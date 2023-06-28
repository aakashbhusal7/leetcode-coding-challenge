class Solution {
  int islandPerimeter(List<List<int>> grid) {
    int peremeter = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 1)
          peremeter = peremeter +
              (4 -
                  ((j == 0 ? 0 : grid[i][j - 1]) +
                      (i == 0 ? 0 : grid[i - 1][j]) +
                      ((j + 1) == grid[i].length ? 0 : grid[i][j + 1]) +
                      ((i + 1) == grid.length ? 0 : grid[i + 1][j])));
      }
    }
    return peremeter;
  }
}

void main() {
  print(Solution().islandPerimeter([
    [0, 1, 0, 0],
    [1, 1, 1, 0],
    [0, 1, 0, 0],
    [1, 1, 0, 0]
  ]).toString());
}





// class Solution {
//   int islandPerimeter(List<List<int>> grid) {
//     int peremeter = 0;
//     for (int i = 0; i < grid.length; i++) {
//       for (int j = 0; j < grid[i].length; j++) {
//         if (grid[i][j] == 1)
//           peremeter = peremeter +
//               _getPeremeter(
//                   j == 0 ? 0 : grid[i][j - 1],
//                   i == 0 ? 0 : grid[i - 1][j],
//                   (j + 1) == grid[i].length ? 0 : grid[i][j + 1],
//                   (i + 1) == grid.length ? 0 : grid[i + 1][j]);
//       }
//       print(i.toString() + "th Peremeter = " + peremeter.toString());
//     }
//     return peremeter;
//   }

//   int _getPeremeter(int left, int top, int right, int down) {
//     return 4 - (left + top + right + down);
//   }
// }
