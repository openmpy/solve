import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] counting = new int[200 + 1];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            counting[sc.nextInt() + 100]++;
        }
        System.out.println(counting[sc.nextInt() + 100]);
    }
}