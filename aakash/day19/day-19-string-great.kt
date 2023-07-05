class Solution {
    fun makeGood(s: String): String {
        val finalResult = Stack<Char>()
        s.forEach { index ->
            if (finalResult.isEmpty()) {
                finalResult.push(index)
            } else {
                val accValue = finalResult.peek()
                if ((accValue.equals(index, true)) && !(accValue
                        .equals(index, false))
                ) {
                    finalResult.pop()
                } else {
                    finalResult.push(index)
                }
            }
        }
        val finalResultString = StringBuilder()
        finalResult.forEach {
            finalResultString.append(it)
        }
        return finalResultString.toString()
    }
}