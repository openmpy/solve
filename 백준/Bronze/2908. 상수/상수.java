import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = Math.max(change(n), change(m));
        System.out.println(max);
    }

    public static int change(int num) {
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;

        return c * 100 + b * 10 + a;
    }
}