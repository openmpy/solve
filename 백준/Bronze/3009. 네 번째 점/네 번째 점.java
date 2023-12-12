import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][2];

        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();

        arr[1][0] = sc.nextInt();
        arr[1][1] = sc.nextInt();

        arr[2][0] = sc.nextInt();
        arr[2][1] = sc.nextInt();

        if (arr[0][0] == arr[1][0]) {
            arr[3][0] = arr[2][0];
        } else if (arr[0][0] == arr[2][0]) {
            arr[3][0] = arr[1][0];
        } else if (arr[1][0] == arr[2][0]) {
            arr[3][0] = arr[0][0];
        }

        if (arr[0][1] == arr[1][1]) {
            arr[3][1] = arr[2][1];
        } else if (arr[0][1] == arr[2][1]) {
            arr[3][1] = arr[1][1];
        } else if (arr[1][1] == arr[2][1]) {
            arr[3][1] = arr[0][1];
        }

        System.out.println(arr[3][0] + " " + arr[3][1]);
    }
}