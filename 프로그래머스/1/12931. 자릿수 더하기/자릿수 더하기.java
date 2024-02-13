import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        int answer = 0;
        
        for (char c : s.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
}