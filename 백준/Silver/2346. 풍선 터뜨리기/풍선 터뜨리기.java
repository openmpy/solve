import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
            deque.add(i + 1);
        }

        int number = count[0];
        deque.removeFirst();

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");

        while (!deque.isEmpty()) {
            int integer;
            if (number > 0) {
                for (int i = 0; i < number; i++) {
                    deque.addLast(deque.removeFirst());
                }
                integer = deque.removeLast();
            } else {
                for (int i = 0; i < Math.abs(number); i++) {
                    deque.addFirst(deque.removeLast());
                }
                integer = deque.removeFirst();
            }

            number = count[integer - 1];
            sb.append(integer + " ");
        }
        System.out.println(sb);
    }
}