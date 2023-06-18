import 'dart:math';

class Solution {
  List<String> findRestaurant(List<String> list1, List<String> list2) {
    List<String> result = [];
    int max = list1.length + list2.length;
    for (int i = 0; i < list1.length; i++) {
      if (list2.contains(list1[i])) {
        int list2Index = list2.indexOf(list1[i]);
        if (i + list2Index < max) {
          result.clear();
          max = i + list2Index;
          result.add(list1[i]);
        } else if (i + list2Index == max) {
          result.add(list1[i]);
        }
      }
    }
    return result;
  }
}

void main() {
  List<String> data = Solution().findRestaurant([
    "Shogun",
    "Tapioca Express",
    "Burger King",
    "KFC"
  ], [
    "Piatti",
    "The Grill at Torrey Pines",
    "Hungry Hunter Steakhouse",
    "Shogun"
  ]);
  print(";ength = " + data.length.toString());
  data.forEach((element) {
    print("result = " + e.toString());
  });
}
