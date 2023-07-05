import java.lang.StringBuilder

class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val map: HashMap<Int, Char> = HashMap()
        val alphabets = ('A').rangeTo('Z').toMutableList()
        for( i in 0 until alphabets.size){
            map[i+1] = alphabets[i]
        }
        val sb=StringBuilder()
        var tempColumnNumber=columnNumber
        if(columnNumber.toString().length<2) {
            return map[columnNumber].toString()
        }else {
            while (tempColumnNumber > 0) {
                val reminder = tempColumnNumber % 26
                if(reminder==0){
                    sb.append('Z').toString()
                    tempColumnNumber=(tempColumnNumber/26)-1
                }else{
                    sb.append(map[reminder]).toString()
                    tempColumnNumber /= 26
                }
            }
        }
        return sb.reverse().toString()
    }
}