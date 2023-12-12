import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int num1 = Math.min(w - x, h - y);
        int num2 = Math.min(x, y);

        System.out.println(Math.min(num1, num2));
    }
}