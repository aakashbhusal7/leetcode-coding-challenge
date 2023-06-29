class Solution {
  String addStrings(String num1, String num2) {
    final l1 = num1.split("");
    final l2 = num2.split("");
    if (l1.length == 1 && l2.length == 1) {
      return (int.parse(l1[0]) + int.parse(l2[0])).toString();
    }
    final diff = l1.length - l2.length;
    if (diff > 0) {
      for (var i = 0; i < diff; i++) {
        l2.insert(0, "0");
      }
    } else if (diff < 0) {
      for (var i = 0; i < diff.abs(); i++) {
        l1.insert(0, "0");
      }
    }
    final r1 = l1.reversed.toList();
    final r2 = l2.reversed.toList();
    int carry = 0;
    List<String> total = [];
    for (var i = 0; i < r1.length; i++) {
      final n1 = int.parse(r1[i]);
      final n2 = int.parse(r2[i]);
      int sum = n1 + n2;
      if (carry != 0) {
        sum = sum + carry;
        carry = 0;
      }
      if (sum >= 10) {
        carry = 1;
        total.add((sum - 10).toString().substring(0));
      } else {
        total.add(sum.toString());
      }
      if (i == r1.length - 1 && carry != 0) total.add("1");
    }
    return total.reversed.join();
  }
}
