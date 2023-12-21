import java.util.Scanner;

public class Main {

    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        hanoi(n, 1, 2, 3);

        System.out.println(count);
        System.out.print(sb);
    }

    public static void hanoi(int n, int start, int mid, int to) {
        count++;

        if (n == 1) {
            sb.append(start + " " + to).append('\n');
            return;
        }

        hanoi(n - 1, start, to, mid);
        sb.append(start + " " + to).append('\n');
        hanoi(n - 1, mid, start, to);
    }
}