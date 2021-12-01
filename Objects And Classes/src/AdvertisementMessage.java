import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = new String[]{"Excellent product.", "Such a greta product.", "Best product of its category.",
                "Exceptional product.", "I can't live without this product."};

        String[] events = new String[]{"Now i feel good.", "I have succeeded with this product.",
                "Makes miracles. I ama happy of the results!", "I cannot believe but now i feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt(scanner.nextLine());

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            String phrase = phrases[rand.nextInt(phrases.length)];
            String event = events[rand.nextInt(events.length)];
            String author = authors[rand.nextInt(authors.length)];
            String city = cities[rand.nextInt(cities.length)];

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }

    }
}
