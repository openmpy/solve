import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        dfs(1, 0);

        System.out.print(sb);
    }

    public static void dfs(int at, int depth) {
        if (depth == m) {
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= n; i++) {
            arr[depth] = i;
            dfs(at, depth + 1);
        }
    }
}