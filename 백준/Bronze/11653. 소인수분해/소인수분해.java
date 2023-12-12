import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 2;

        while (n >= m) {
            if (n % m == 0) {
                System.out.println(m);
                n /= m;
            } else {
                m++;
            }
        }
    }
}