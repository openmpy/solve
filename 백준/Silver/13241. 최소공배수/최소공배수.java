import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();
        long y = sc.nextInt();

        System.out.println((x * y) / max(x, y));
    }

    public static long max(long a, long b) {
        while (b >= 1) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}