import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            for (int j = i; j < text.length(); j++) {
                String s = text.substring(i, j + 1);
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}