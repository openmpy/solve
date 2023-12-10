import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();

        int[] arr = new int[n];

        while (T-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int l = i - 1; l < j; l++) {
                arr[l] = k;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}