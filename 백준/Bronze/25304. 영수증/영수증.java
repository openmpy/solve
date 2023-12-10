import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int T = sc.nextInt();

        while (T-- > 0) {
            int price = sc.nextInt();
            int amount = sc.nextInt();

            total -= price * amount;
        }

        System.out.println(total == 0 ? "Yes" : "No");
    }
}