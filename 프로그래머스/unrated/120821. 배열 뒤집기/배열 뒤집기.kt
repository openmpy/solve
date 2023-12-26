class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.toList().reversed()
        return answer.toIntArray()
    }
}