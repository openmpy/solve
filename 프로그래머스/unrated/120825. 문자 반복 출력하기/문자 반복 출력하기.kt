class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        
        for (c in my_string) {
            answer += c.toString().repeat(n)
        }
        return answer
    }
}