import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();

        for (int person : people) {
            deque.push(person);
        }

        int answer = 0;
        while (!deque.isEmpty()) {
            int first = deque.pollFirst();
            if (!deque.isEmpty() && first + deque.peekLast() <= limit) {
                deque.pollLast();
            }
            answer++;
        }
        return answer;
    }
}