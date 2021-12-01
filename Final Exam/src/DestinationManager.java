import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([=\\/])([A-Z][A-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        int counter = 0;

        String inputLoc = scanner.nextLine();
        Matcher matcher = pattern.matcher(inputLoc);

        List<String> places = new ArrayList<>();

        while (matcher.find()) {
            counter += matcher.group(2).length();
            places.add(matcher.group(2));

        }

        System.out.printf("Destinations: %s%n", String.join(", ", places));

        System.out.println("Travel Points: " + counter);
    }
}
