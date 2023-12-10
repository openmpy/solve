import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[] chars = String.valueOf(m).toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(n * (chars[i] - '0'));
        }
        System.out.println(n * m);
    }
}