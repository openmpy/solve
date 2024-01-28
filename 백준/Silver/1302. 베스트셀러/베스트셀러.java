import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String title = sc.next();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        int max = 0;
        for (Integer value : map.values()) {
            max = Math.max(max, value);
        }

        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                list.add(s);
            }
        }
        list.sort(String::compareTo);

        System.out.println(list.get(0));
    }
}
