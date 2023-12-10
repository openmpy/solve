import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n - i - 1));
            System.out.print("*".repeat(i * 2 + 1));
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ".repeat(i + 1));
            System.out.print("*".repeat(n * 2 - ((i + 1) * 2 + 1)));
            System.out.println();
        }
    }
}