import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int[] arr = new int[i];
        for (int k = 0; k < i; k++) {
            arr[k] = k + 1;
        }

        for (int k = 0; k < j; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            int tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}