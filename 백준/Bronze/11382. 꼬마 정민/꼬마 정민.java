import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String[] split = text.split(" ");

        long answer = 0;
        for (String s : split) {
            answer += Long.parseLong(s);
        }
        System.out.println(answer);
    }
}