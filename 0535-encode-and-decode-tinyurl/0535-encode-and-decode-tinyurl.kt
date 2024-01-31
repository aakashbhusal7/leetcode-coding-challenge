class Codec() {
    val map = mutableMapOf<String, String>()
    var increment = 100

    fun encode(longUrl: String): String {
        val key = Integer.toHexString(increment++)
        map[key] = longUrl
        return "http://tinyurl.com/" + key
    }

    fun decode(shortUrl: String): String {
        val key = shortUrl.substring(shortUrl.indexOfLast { it=='/' }+1)
        return map[key]!!
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */