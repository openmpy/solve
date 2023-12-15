import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n + m; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long answer = map.keySet().stream()
                .filter(integer -> map.get(integer) == 1)
                .count();

        System.out.println(answer);
    }
}