import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")) {
            String reverse = reverse(word);

            System.out.printf("%s = %s", word, reverse);
            word = scanner.nextLine();
        }

    }

    private static String reverse(String word) {
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }

        return result;
    }
}
