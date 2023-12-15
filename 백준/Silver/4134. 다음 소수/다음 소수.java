import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (long num = sc.nextLong(); num <= 4 * 2_000_000_000L; num++) {
                if (checked(num)) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }

    public static boolean checked(long n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}