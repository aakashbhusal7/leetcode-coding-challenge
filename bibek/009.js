var acc = (arr, i, j) => arr[i] ? arr[i][j] || 0 : 0;
var counter = (ar, i, j) => acc(ar, i + 1, j) + acc(ar, i - 1, j) + acc(ar, i, j - 1) + acc(ar, i, j + 1);
var islandPerimeter = grid => grid.map((b, i, ar) => b.map((y, j) => y == 0 ? 0 : (4 * y - counter(grid, i, j)))).flat().reduce((a, b) => a + b, 0);
