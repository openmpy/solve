import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int money = sc.nextInt() * 10;

            int quarter = money / 250;
            money %= 250;

            int dime = money / 100;
            money %= 100;

            int nickel = money / 50;
            money %= 50;

            int penny = money / 10;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}