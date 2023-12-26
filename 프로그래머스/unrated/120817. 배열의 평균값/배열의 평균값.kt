class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0

        numbers.forEach { 
            i: Int -> answer += i 
        }
        return answer / numbers.size
    }
}