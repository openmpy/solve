import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int x = n / h + 1;
            int y = n % h;

            if (n % h == 0) {
                x = n / h;
                y = h;
            }

            System.out.printf("%d%02d%n", y, x);
        }
    }
}
