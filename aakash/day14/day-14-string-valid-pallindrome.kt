class Solution {
    fun isPalindrome(s: String): Boolean {
        val regex = Regex("[^A-Za-z0-9]")
        val finalString = regex.replace(s, "")
        val reverseString = finalString.toLowerCase().reversed()
        return reverseString == regex.replace(s, "").toLowerCase()
    }
}