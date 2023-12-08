import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        Map<String, String> map = new TreeMap<>(Comparator.reverseOrder());

        while (T-- > 0) {
            String name = sc.next();
            String text = sc.next();

            if (text.equals("enter")) {
                map.put(name, name);
            } else if (text.equals("leave")) {
                map.remove(name);
            }
        }

        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}