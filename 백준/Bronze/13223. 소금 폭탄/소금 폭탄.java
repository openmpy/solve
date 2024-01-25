import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        String y = sc.next();

        String[] first = x.split(":");
        String[] second = y.split(":");

        int firstHour = Integer.parseInt(first[0]);
        int firstMinute = Integer.parseInt(first[1]);
        int firstSecond = Integer.parseInt(first[2]);

        int secondHour = Integer.parseInt(second[0]);
        int secondMinute = Integer.parseInt(second[1]);
        int secondSecond = Integer.parseInt(second[2]);

        int firstAll = firstHour * 3600 + firstMinute * 60 + firstSecond;
        int secondAll = secondHour * 3600 + secondMinute * 60 + secondSecond;

        int total = secondAll - firstAll;
        int h = 0;
        int m = 0;
        int s = 0;

        if (total <= 0) {
            total = 24 * 3600 + total;
        }

        h = total / 3600;
        m = total % 3600 / 60;
        s = total % 60;

        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
