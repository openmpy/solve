import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        double v = Arrays.stream(arr)
                .average().orElse(0);

        System.out.println((int) v);
        System.out.println(arr[2]);
    }
}