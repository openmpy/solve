class Solution {
    public int solution(int n) {
        int answer = 1;
        int start = 1;

        while (start <= n / 2) {
            int sum = 0;
            for (int i = start; i <= n / 2 + 1; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
            start++;
        }
        return answer;
    }
}