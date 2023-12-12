import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] checked = new boolean[10000 + 1];
        checked[0] = checked[1] = true;

        for (int i = 2; i * i <= checked.length - 1; i++) {
            if (checked[i]) {
                continue;
            }

            for (int j = i * i; j <= checked.length - 1; j += i) {
                checked[j] = true;
            }
        }

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = n; i <= m; i++) {
            if (!checked[i]) {
                min = Math.min(i, min);
                sum += i;
            }
        }

        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}