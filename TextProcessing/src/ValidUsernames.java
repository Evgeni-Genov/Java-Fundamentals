import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        for (String s1 : names) {
            if (isValid(s1)) {
                System.out.println(s1);
            }

        }
    }

    private static boolean isValid(String s1) {
        if (s1.length() < 3 || s1.length() > 16) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char symbol = s1.charAt(i);

            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;

    }
}
