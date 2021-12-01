import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharsCountInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> charsCount = new LinkedHashMap<>();
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != ' ') {
                if (charsCount.containsKey(currentChar)) {
                    int count = charsCount.get(currentChar);
                    charsCount.put(currentChar, count + 1);

                } else {
                    charsCount.put(currentChar, 1);
                }
            }
        }

        charsCount
                .forEach((k, v) -> System.out.println(String.format("%c -> %d", k, v)));
    }
}
