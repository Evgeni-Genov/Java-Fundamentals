import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first > second)
            printSymbolsInRange(second, first);

        else printSymbolsInRange(first, second);

    }

    public static void printSymbolsInRange(char a, char b) {
        for (char i = ++a; i < b; i++) {
            System.out.printf("%c ", i);

        }
    }
}
