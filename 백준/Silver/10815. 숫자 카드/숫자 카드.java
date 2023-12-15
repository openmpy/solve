import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, true));
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            sb.append(map.containsKey(num) ? "1" : "0").append(' ');
        }
        System.out.println(sb);
    }
}