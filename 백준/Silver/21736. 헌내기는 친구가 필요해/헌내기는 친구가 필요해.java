import java.util.Scanner;

public class Main {

    public static boolean[][] visited;

    public static int[] dRow = {-1, 1, 0, 0}; // 상하좌우
    public static int[] dCol = {0, 0, -1, 1}; // 상하좌우

    public static int N;
    public static int M;

    public static char[][] room;
    public static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        room = new char[N][M];
        visited = new boolean[N][M];

        int row = 0;
        int col = 0;

        for (int i = 0; i < N; i++) {
            String text = sc.next();

            for (int j = 0; j < M; j++) {
                room[i][j] = text.charAt(j);

                if (room[i][j] == 'I') {
                    row = i;
                    col = j;
                }
            }
        }
        DFS(row, col);

        if (answer == 0) {
            System.out.println("TT");
        } else {
            System.out.println(answer);
        }
    }

    public static void DFS(int row, int col) {
        visited[row][col] = true;

        if (room[row][col] == 'P') {
            answer++;
        }

        for (int i = 0; i < 4; i++) {
            int newRow = row + dRow[i];
            int newCol = col + dCol[i];

            if (newRow > -1 && newCol > -1 && newRow < N && newCol < M && !visited[newRow][newCol]) {
                if (room[newRow][newCol] != 'X') {
                    DFS(newRow, newCol);
                }
            }
        }
    }
}
