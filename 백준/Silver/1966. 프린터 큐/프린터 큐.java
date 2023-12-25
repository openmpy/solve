import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> queueIndex = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                queue.add(sc.nextInt());
                queueIndex.add(j);
            }

            int count = 1;
            while (!queue.isEmpty()) {
                int max = Collections.max(queue);
                int cur = queue.poll();
                int curIndex = queueIndex.poll();

                if (cur == max) {
                    if (curIndex == m) {
                        System.out.println(count);
                        break;
                    }
                    count++;
                } else {
                    queue.add(cur);
                    queueIndex.add(curIndex);
                }
            }
        }
    }
}
