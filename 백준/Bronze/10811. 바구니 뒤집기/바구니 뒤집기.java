import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int index = b - 1;
            int[] tmp = new int[b - a + 1];
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = arr[index--];
            }

            int index2 = 0;
            for (int j = a - 1; j < b; j++) {
                arr[j] = tmp[index2++];
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}