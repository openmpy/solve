import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String text = sc.next();

            boolean isCheck = false;
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < text.length(); j++) {
                if (!stack.isEmpty()) {
                    if (stack.peek() != text.charAt(j) && stack.contains(text.charAt(j))) {
                        isCheck = true;
                        break;
                    }
                }

                stack.push(text.charAt(j));
            }

            if (!isCheck) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}