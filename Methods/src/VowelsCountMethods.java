import java.util.Scanner;

public class VowelsCountMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = vowelsCount(input);

        System.out.println(count);
    }

    public static int vowelsCount(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);

            switch (letter) {
                case 'a':
                case 'u':
                case 'o':
                case 'e':
                case 'i':
                    counter++;

                    break;

            }

        }

        return counter;
    }
}
