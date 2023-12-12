import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            strings[i] = sc.next();
            maxLength = Math.max(strings[i].length(), maxLength);
        }

        StringBuilder sb = new StringBuilder();
        String[][] chars = new String[5][maxLength];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                chars[i][j] = String.valueOf(strings[i].charAt(j));
            }
        }

        // 00 10 20 30 40
        // 01 11 21 31 41

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j][i] == null) {
                    continue;
                }

                sb.append(chars[j][i]);
            }
        }
        System.out.println(sb);
    }
}