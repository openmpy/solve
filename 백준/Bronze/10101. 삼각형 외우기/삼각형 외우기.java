import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (arr[0] + arr[1] + arr[2] == 180) {
            if (arr[0] == arr[2]) {
                System.out.println("Equilateral");
            } else if (arr[0] == arr[1] && arr[1] != arr[2] || arr[1] == arr[2] && arr[0] != arr[1]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}