import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int n = sc.nextInt();

        int num = Integer.parseInt(text, n);
        System.out.println(num);
    }
}