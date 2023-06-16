// class Solution {
//   int findContentChildren(List<int> g, List<int> s) {
//     List<int> filtered = s;
//     int count = 0;
//     for (int i = 0; i < g.length; i++) {
//       for (int j = 0; j < filtered.length; j++) {
//         if (g[i] == filtered[j]) {
//           filtered.removeAt(j);
//           count++;
//           break;
//         }
//       }
//     }
//     return count;
//   }
// }

class Solution {
  int findContentChildren(List<int> child, List<int> cookies) {
    child.sort();
    cookies.sort();
    int cookieIndex = 0;
    int count = 0;
    for (int i = 0; i < child.length; i++) {
      if (cookieIndex < cookies.length) {
        if (child[i] <= cookies[cookieIndex]) {
          count++;
          cookieIndex++;

        } else {
          cookieIndex++;
          i--;
        }
      }
    }
    return count;
  }
}

void main() {
  print(Solution().findContentChildren(
      // [1, 2, 3, 8, 9, 7, 6, 22, 28, 29, 20, 20, 12, 1, 29, 2],
      // [1, 1, 2, 34, 5, 9, 3, 7, 28]));
      [1, 1, 3, 6, 7, 8, 9, 12, 20, 20, 22, 28, 28, 29],
      [1, 1, 2, 3, 5, 7, 9, 28, 34]));
}
