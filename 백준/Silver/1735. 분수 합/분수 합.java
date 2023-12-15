import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();

        arr[1][0] = sc.nextInt();
        arr[1][1] = sc.nextInt();

        int x = arr[0][0] * arr[1][1] + arr[0][1] * arr[1][0];
        int y = arr[0][1] * arr[1][1];

        System.out.println((x / gcd(x, y)) + " " + (y / gcd(x, y)));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}