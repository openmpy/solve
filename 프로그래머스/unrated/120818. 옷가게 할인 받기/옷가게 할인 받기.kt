class Solution {
    fun solution(price: Int): Int {
        var answer: Int = price
        
        if (price >= 500_000) {
            answer = (price * 0.8).toInt()
        } else if (price >= 300_000) {
            answer = (price * 0.9).toInt()
        } else if (price >= 100_000) {
            answer = (price * 0.95).toInt()
        }
        return answer
    }
}