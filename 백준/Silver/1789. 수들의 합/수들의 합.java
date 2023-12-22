import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();

        long sum = 0;
        int count = 0;
        int index = 1;

        while (true) {
            if (sum > s) {
                System.out.println(count - 1);
                break;
            }

            sum += index;
            index++;
            count++;
        }
    }
}
