import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String text = sc.next();
            System.out.println(text.charAt(0) + String.valueOf(text.charAt(text.length() - 1)));
        }
    }
}