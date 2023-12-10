import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[8];
        words[0] = "c=";
        words[1] = "c-";
        words[2] = "dz=";
        words[3] = "d-";
        words[4] = "lj";
        words[5] = "nj";
        words[6] = "s=";
        words[7] = "z=";

        String text = sc.next();
        for (String word : words) {
            text = text.replace(word, ".");
        }
        System.out.println(text.length());
    }
}