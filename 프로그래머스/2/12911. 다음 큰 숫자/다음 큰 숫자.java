class Solution {
    public int solution(int n) {
        int num = n + 1;
        int count = Integer.bitCount(n);
        
        int answer = 0;
        while (true) {
            if (count == Integer.bitCount(num)) {
                answer = num;
                break;
            }
            num++;
        }
        return answer;
    }
}