import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int addMinute = sc.nextInt();

        int totalMinute = hour * 60 + minute + addMinute;

        int newHour = totalMinute / 60;
        int newMinute = totalMinute % 60;

        System.out.println(newHour % 24 + " " + newMinute);
    }
}