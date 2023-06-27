class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val mappedWord: ArrayList<Char> = arrayListOf()
        val hashMap: MutableMap<Char, Char> = hashMapOf()
        val rev: HashMap<Char, Char> = hashMapOf()
        for (i in s.indices) {
            hashMap[s[i]] = t[i]
        }
        hashMap.forEach { (key, value) -> rev[value] = key }
        if(t.length!=hashMap.size){return false }
        for (element in t) {
            rev[element]?.let { mappedWord.add(it) }
        }
        return s == mappedWord.joinToString(separator = "")
    }
}