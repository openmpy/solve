import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] checked = {"WBWBWBWB", "BWBWBWBW"};

        int h = sc.nextInt();
        int w = sc.nextInt();

        String[] board = new String[h];
        for (int i = 0; i < h; i++) {
            board[i] = sc.next();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= h - 8; i++) {
            for (int j = 0; j <= w - 8; j++) {
                int num = getWhite(checked, board, i, j);
                min = Math.min(min, num);
            }
        }
        System.out.println(min);
    }

    private static int getWhite(String[] checked, String[] board, int i, int j) {
        int white = 0;
        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                if (board[k].charAt(l) != checked[k % 2].charAt(l - j)) {
                    white++;
                }
            }
        }
        return Math.min(white, 64 - white);
    }
}