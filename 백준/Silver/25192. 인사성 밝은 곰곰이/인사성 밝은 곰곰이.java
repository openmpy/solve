import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String text = sc.next();
            if (text.equals("ENTER")) {
                map.clear();
                continue;
            }
            if (map.containsKey(text)) {
                continue;
            }

            map.put(text, 1);
            answer++;
        }

        System.out.println(answer);
    }
}