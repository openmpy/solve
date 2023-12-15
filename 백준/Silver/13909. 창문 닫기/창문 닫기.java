import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println((int) Math.sqrt(n));
    }

    /*
    01 - 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 - 1
    02 - 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 - 1
    03 - 1 0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 - 1
    04 - 1 0 0 1 1 1 1 1 0 0 1 0 1 0 0 1 - 2
    05 - 1 0 0 1 0 1 1 1 0 1 1 0 1 0 1 1 - 2
    06 - 1 0 0 1 0 0 1 1 0 1 1 1 1 0 1 1 - 2
    07 - 1 0 0 1 0 0 0 1 0 1 1 1 1 1 1 1 - 2
    08 - 1 0 0 1 0 0 0 0 0 1 1 1 1 1 1 0 - 2
    09 - 1 0 0 1 0 0 0 0 1 1 1 1 1 1 1 0 - 3
    */
}