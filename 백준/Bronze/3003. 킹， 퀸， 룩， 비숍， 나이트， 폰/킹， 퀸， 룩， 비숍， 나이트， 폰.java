import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        arr[0] = arr[1] = 1;
        arr[2] = arr[3] = arr[4] = 2;
        arr[5] = 8;

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] - sc.nextInt() + " ");
        }
    }
}