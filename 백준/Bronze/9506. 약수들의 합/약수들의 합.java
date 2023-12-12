import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < list.size() - 1; i++) {
                    sb.append(list.get(i) + " + ");
                }
                System.out.println(n + " = " + list.get(0) + " + " + sb + list.get(list.size() - 1));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}