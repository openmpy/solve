import java.util.Scanner;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            int n = sc.nextInt();
            String line = "-".repeat((int) Math.pow(3, n));

            sb.delete(0, sb.length());
            sb.append(line);

            get(0, sb.length());
            System.out.println(sb);
        }
    }

    public static void get(int start, int length) {
        if (length == 1) {
            return;
        }

        for (int i = start + length / 3; i < start + length / 3 * 2; i++) {
            sb.setCharAt(i, ' ');
        }

        get(start, length / 3);
        get(start + length / 3 * 2, length / 3);
    }

    /*
        ---------
        ---   ---
        - -   - -
    */
}