import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println((x * y) / max(x, y));
        }
    }

    public static int max(int a, int b) {
        while (b >= 1) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}