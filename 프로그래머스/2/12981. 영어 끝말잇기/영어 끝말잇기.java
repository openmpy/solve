import java.util.Stack;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < words.length; i++) {
            if (!stack.isEmpty()) {
                String peek = stack.peek();
                if (peek.charAt(peek.length() - 1) == words[i].charAt(0)) {
                    if (stack.contains(words[i])) {
                        answer[0] = i % n + 1;
                        answer[1] = i / n + 1;
                        break;
                    }
                } else {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
                }
            }
            stack.push(words[i]);
        }
        return answer;
    }
}