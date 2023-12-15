import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] checked = new boolean[1000000 + 1];
        checked[0] = checked[1] = true;

        for (int i = 2; i * i <= checked.length - 1; i++) {
            if (checked[i]) {
                continue;
            }

            for (int j = i * i; j <= checked.length - 1; j += i) {
                checked[j] = true;
            }
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();

            int count = 0;
            for (int j = 2; j <= num / 2; j++) {
                if (!checked[j] && !checked[num - j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}