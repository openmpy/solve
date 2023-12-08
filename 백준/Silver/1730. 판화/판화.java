import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[][] arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = '.';
            }
        }

        int x = 0;
        int y = 0;

        String text = "";
        if (sc.hasNext()) {
            text = sc.next();
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'U') {
                if (y - 1 < 0) {
                    continue;
                }

                if (arr[y][x] == '.') {
                    arr[y][x] = '|';
                } else if (arr[y][x] == '-') {
                    arr[y][x] = '+';
                }

                y--;
                if (arr[y][x] == '.') {
                    arr[y][x] = '|';
                } else if (arr[y][x] == '-') {
                    arr[y][x] = '+';
                }
            } else if (text.charAt(i) == 'D') {
                if (y + 1 >= N) {
                    continue;
                }

                if (arr[y][x] == '.') {
                    arr[y][x] = '|';
                } else if (arr[y][x] == '-') {
                    arr[y][x] = '+';
                }

                y++;
                if (arr[y][x] == '.') {
                    arr[y][x] = '|';
                } else if (arr[y][x] == '-') {
                    arr[y][x] = '+';
                }
            } else if (text.charAt(i) == 'R') {
                if (x + 1 >= N) {
                    continue;
                }

                if (arr[y][x] == '.') {
                    arr[y][x] = '-';
                } else if (arr[y][x] == '|') {
                    arr[y][x] = '+';
                }

                x++;
                if (arr[y][x] == '.') {
                    arr[y][x] = '-';
                } else if (arr[y][x] == '|') {
                    arr[y][x] = '+';
                }
            } else if (text.charAt(i) == 'L') {
                if (x - 1 < 0) {
                    continue;
                }

                if (arr[y][x] == '.') {
                    arr[y][x] = '-';
                } else if (arr[y][x] == '|') {
                    arr[y][x] = '+';
                }

                x--;
                if (arr[y][x] == '.') {
                    arr[y][x] = '-';
                } else if (arr[y][x] == '|') {
                    arr[y][x] = '+';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}