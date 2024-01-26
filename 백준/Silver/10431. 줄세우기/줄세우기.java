import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        int[][] student = new int[P][20];
        for (int i = 0; i < P; i++) {
            int index = sc.nextInt() - 1;

            for (int j = 0; j < 20; j++) {
                student[index][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < P; i++) {
            int answer = 0;
            for (int j = 0; j < 20 - 1; j++) {
                for (int k = j + 1; k < 20; k++) {
                    if (student[i][j] > student[i][k]) {
                        int temp = student[i][j];
                        student[i][j] = student[i][k];
                        student[i][k] = temp;
                        answer++;
                    }
                }
            }
            System.out.println((i + 1) + " " + answer);
        }
    }
}