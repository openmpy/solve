import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2 3 5 9 17 33
        // 0 1 2 3 04 05

        int n = sc.nextInt();

        int v = (int) (Math.pow(2, n) + 1);

        System.out.println(v * v);
    }
}