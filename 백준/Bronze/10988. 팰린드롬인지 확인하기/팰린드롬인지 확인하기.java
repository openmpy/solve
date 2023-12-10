import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        StringBuilder sb = new StringBuilder(text);
        String reverse = sb.reverse().toString();

        System.out.println(text.equals(reverse) ? 1 : 0);
    }
}