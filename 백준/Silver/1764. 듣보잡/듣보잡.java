import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n + m; i++) {
            String name = sc.next();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (String s : map.keySet()) {
            if (map.get(s) < 2) {
                continue;
            }

            count++;
            sb.append(s).append('\n');
        }

        System.out.println(count);
        System.out.print(sb);
    }
}