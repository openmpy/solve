class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for(int item : arr) {
            answer = lcm(answer, item);
        }
        return answer;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}