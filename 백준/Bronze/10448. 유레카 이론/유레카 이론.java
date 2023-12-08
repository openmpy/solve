import java.util.Scanner;

public class Main {

    /*
        1 - 1
        2 - 3
        3 - 6
        4 - 10
        5 - 15
        6 - 21
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[45];
        int num = 2;
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + num;
            num++;
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(check(arr, sc.nextInt()));
        }
    }

    public static int check(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == num) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}