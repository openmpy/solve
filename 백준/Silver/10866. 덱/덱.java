import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String text = sc.next();

            if (text.equals("push_front")) {
                int num = sc.nextInt();
                deque.addFirst(num);
            } else if (text.equals("push_back")) {
                int num = sc.nextInt();
                deque.addLast(num);
            } else if (text.equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.pollFirst()).append('\n');
                }
            } else if (text.equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.pollLast()).append('\n');
                }
            } else if (text.equals("size")) {
                sb.append(deque.size()).append('\n');
            } else if (text.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append('\n');
            } else if (text.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekFirst()).append('\n');
                }
            } else if (text.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekLast()).append('\n');
                }
            }
        }
        System.out.print(sb);
    }
}
