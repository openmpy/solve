class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int h = 0;
        int w = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    w = j;
                    h = i;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            int count = Integer.parseInt(split[1]);

            boolean isChecked = false;
            int beforeW = w;
            int beforeH = h;

            if (split[0].equals("E")) {
                for (int j = 0; j < count; j++) {
                    w++;

                    if (w >= park[0].length()) {
                        isChecked = true;
                        break;
                    }
                    if (park[h].charAt(w) == 'X') {
                        isChecked = true;
                        break;
                    }
                }
            } else if (split[0].equals("W")) {
                for (int j = 0; j < count; j++) {
                    w--;

                    if (w < 0) {
                        isChecked = true;
                        break;
                    }
                    if (park[h].charAt(w) == 'X') {
                        isChecked = true;
                        break;
                    }
                }
            } else if (split[0].equals("N")) {
                for (int j = 0; j < count; j++) {
                    h--;

                    if (h < 0) {
                        isChecked = true;
                        break;
                    }
                    if (park[h].charAt(w) == 'X') {
                        isChecked = true;
                        break;
                    }
                }
            } else if (split[0].equals("S")) {
                for (int j = 0; j < count; j++) {
                    h++;

                    if (h >= park.length) {
                        isChecked = true;
                        break;
                    }
                    if (park[h].charAt(w) == 'X') {
                        isChecked = true;
                        break;
                    }
                }
            }

            if (isChecked) {
                w = beforeW;
                h = beforeH;
            }
        }
        
        answer[0] = h;
        answer[1] = w;
        return answer;
    }
}