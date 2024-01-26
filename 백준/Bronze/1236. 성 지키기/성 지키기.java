import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] room = new String[N];
        int answer = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {
            room[i] = sc.next();

            if (!room[i].contains("X")) {
                x++;
            }
        }

        for (int i = 0; i < M; i++) {
            boolean isCheck = false;
            for (int j = 0; j < room.length; j++) {
                if (room[j].charAt(i) == 'X') {
                    isCheck = true;
                    break;
                }
            }

            if (!isCheck) {
                y++;
            }
        }
        System.out.println(Math.max(x, y));
    }
}