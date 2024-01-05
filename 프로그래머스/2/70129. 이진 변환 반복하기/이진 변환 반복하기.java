class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (true) {
            if (s.equals("1")) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    sb.append(s.charAt(i));
                }
            }
            s = Integer.toString(sb.length(), 2);
            answer[0]++;
        }
        return answer;
    }
}