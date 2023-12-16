import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        arr = new int[t];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();

            if (num == 1) {
                push(sc.nextInt());
            } else if (num == 2) {
                sb.append(pop()).append('\n');
            } else if (num == 3) {
                sb.append(size()).append('\n');
            } else if (num == 4) {
                sb.append(empty()).append('\n');
            } else if (num == 5) {
                sb.append(peek()).append('\n');
            }
        }
        System.out.print(sb);
    }

    public static void push(int num) {
        arr[size++] = num;
    }

    public static int pop() {
        if (size <= 0) {
            return -1;
        }

        int tmp = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return tmp;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }

        return 0;
    }

    public static int peek() {
        if (size == 0) {
            return -1;
        }

        return arr[size - 1];
    }
}