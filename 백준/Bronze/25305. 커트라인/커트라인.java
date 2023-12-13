import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int C = sc.nextInt();

        int[] score = new int[T];

        for (int i = 0; i < T; i++) {
            score[i] = sc.nextInt();
        }

        Arrays.sort(score);
        System.out.println(score[T - C]);
    }
}