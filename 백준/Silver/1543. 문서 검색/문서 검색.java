import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String find = sc.nextLine();

        int answer = 0;
        int startIndex = 0;

        while (true) {
            int index = text.indexOf(find, startIndex);

            if (index == -1) {
                break;
            }

            startIndex = index + find.length();
            answer++;
        }

        System.out.println(answer);
    }
}