class Solution {
  bool lemonadeChange(List<int> bills) {
    int five = 0;
    int ten = 0;

    for (var i = 0; i <= bills.length - 1; i++) {
      final current = bills[i];
      final r = current - 5;
      if (r == 0) {
        five++;
        continue;
      }
      if (r == 5) {
        ten++;
        five--;
        if (five < 0) return false;
      } else if (r == 10) {
        if (ten > 0) {
          ten--;
        } else {
          five--;
        }
        if (five < 0) return false;
      } else {
        if (ten > 0) {
          ten--;
          five--;
        } else {
          five = five - 3;
        }
        if (five < 0 || ten < 0) return false;
      }
    }
    return true;
  }
}
