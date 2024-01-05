class Solution {
    public String solution(String s) {
        boolean isChecked = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                isChecked = true;
                sb.append(' ');
                continue;
            }

            if (isChecked) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                isChecked = false;
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}