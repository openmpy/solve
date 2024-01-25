import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
        }
        System.out.println(sb);
    }
}