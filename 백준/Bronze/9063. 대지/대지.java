import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] point = new int[T][2];

        for (int i = 0; i < T; i++) {
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < T; i++) {
            minX = Math.min(point[i][0], minX);
            minY = Math.min(point[i][1], minY);

            maxX = Math.max(point[i][0], maxX);
            maxY = Math.max(point[i][1], maxY);
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}