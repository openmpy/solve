import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int num = 1;
        while (n > 0) {
            num *= n;
            n--;
        }
        return num;
    }
}