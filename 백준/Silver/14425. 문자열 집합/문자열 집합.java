import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String text = sc.next();
            map.put(text, map.getOrDefault(text, 0) + 1);
        }

        for (int i = 0; i < M; i++) {
            String text = sc.next();

            if (map.containsKey(text)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}