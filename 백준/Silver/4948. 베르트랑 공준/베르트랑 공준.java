import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] checked = new boolean[123456 * 2 + 1];
        checked[0] = checked[1] = true;

        for (int i = 2; i * i <= checked.length - 1; i++) {
            if (checked[i]) {
                continue;
            }

            for (int j = i * i; j <= checked.length - 1; j += i) {
                checked[j] = true;
            }
        }

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            int count = 0;
            for (int j = num + 1; j <= num * 2; j++) {
                if (!checked[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}