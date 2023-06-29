import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Solution {
    fun addStrings(num1: String, num2: String): String {
        var tempSum: Int = 0
        val finalSumArrayList: ArrayList<Int> = arrayListOf()
        if (num1.length == num2.length && num1.length == 1) {
            return (Integer.parseInt(num1) + Integer.parseInt(num2)).toString()
        }
        if (num1.length >= num2.length) {
            var count: Int = num1.length - 1
            var num2Count: Int = num2.length - 1
            var carry: Int = 0
            while (count >= 0) {
                tempSum = if (num2Count < 0) {
                    Integer.parseInt(num1[count].toString())
                } else {
                    Integer.parseInt(num1[count].toString()) + Integer.parseInt(num2[num2Count].toString())
                }
                if ((tempSum + carry).toString().length <= 1) {
                    finalSumArrayList.add(tempSum + carry)
                    carry = 0
                } else {
                    if (count == 0) {
                        val lastIndex = (tempSum + carry).toString()
                        finalSumArrayList.add(Integer.parseInt(lastIndex))
                    } else {
                        val lastIndex = (tempSum + carry).toString().last().toString()
                        finalSumArrayList.add(Integer.parseInt(lastIndex))
                    }
                }
                if (tempSum > 9) carry = tempSum.toString().substring(0, 1).toInt()
                count--
                num2Count--
            }
            finalSumArrayList.reverse()
        } else {
            var count: Int = num2.length - 1
            var num1Count: Int = num1.length - 1
            var carry: Int = 0
            while (count >= 0) {
                tempSum = if (num1Count < 0) {
                    Integer.parseInt(num2[count].toString())
                } else {
                    Integer.parseInt(num2[count].toString()) + Integer.parseInt(num1[num1Count].toString())
                }
                if ((tempSum + carry).toString().length <= 1) {
                    finalSumArrayList.add(tempSum + carry)
                } else {
                    if (count == 0) {
                        val lastIndex = (tempSum + carry).toString()
                        finalSumArrayList.add(Integer.parseInt(lastIndex))
                    } else {
                        val lastIndex = (tempSum + carry).toString().last().toString()
                        finalSumArrayList.add(Integer.parseInt(lastIndex))
                    }
                }
                if (tempSum > 9) carry = tempSum.toString().substring(0, 1).toInt()
                count--
                num1Count--
            }
            finalSumArrayList.reverse()
        }
        return finalSumArrayList.joinToString(separator = "")
    }

}
