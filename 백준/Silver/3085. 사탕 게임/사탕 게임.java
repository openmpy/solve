import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            String text = sc.next();
            for (int j = 0; j < text.length(); j++) {
                board[i][j] = text.charAt(j);
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 && board[i][j] != board[i][j + 1]) {
                    swap(board, i, j, i, j + 1);
                    answer = Math.max(answer, Math.max(findMaxRaw(board), findMaxColumn(board)));
                    swap(board, i, j, i, j + 1);
                }
                if (i < n - 1 && board[i][j] != board[i + 1][j]) {
                    swap(board, i, j, i + 1, j);
                    answer = Math.max(answer, Math.max(findMaxRaw(board), findMaxColumn(board)));
                    swap(board, i, j, i + 1, j);
                }
            }
        }
        System.out.println(answer);
    }

    public static void swap(char[][] board, int i, int j, int i2, int j2) {
        char ch = board[i][j];
        board[i][j] = board[i2][j2];
        board[i2][j2] = ch;
    }

    public static int findMaxRaw(char[][] board) {
        int max = 0;
        for (int i = 0; i < board.length; i++) {
            int len = 1;
            for (int j = 0; j < board.length - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    len++;
                } else {
                    max = Math.max(max, len);
                    len = 1;
                }
            }
            max = Math.max(max, len);
        }
        return max;
    }

    public static int findMaxColumn(char[][] board) {
        int max = 0;
        for (int i = 0; i < board.length; i++) {
            int len = 1;
            for (int j = 0; j < board.length - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    len++;
                } else {
                    max = Math.max(max, len);
                    len = 1;
                }
            }
            max = Math.max(max, len);
        }
        return max;
    }
}
