class Solution {
    fun isPalindrome(x: Int): Boolean {
           var value  = x.toString()
           var reverse = value.reversed()
           return value == reverse
       }
   }