class Solution {
    var vSet = HashSet<String>() // dead end
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        if (s.isEmpty()) return true
        else if (vSet.contains(s)) return false
        else {
            for (word in wordDict) {
                if (s.startsWith(word)) {
                    if (wordBreak(s.substring(word.length), wordDict))
                        return true
                }
            }
            vSet.add(s)
            return false
        }
    }
}