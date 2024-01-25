import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String word = sc.nextLine();

        int answer = 0;
        int startIndex = 0;

        while (true) {
            int index = text.indexOf(word, startIndex);
            if (index < 0) {
                break;
            }

            answer++;
            startIndex = index + word.length();
        }
        System.out.println(answer);
    }
}
