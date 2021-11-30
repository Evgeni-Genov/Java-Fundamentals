import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int tankCapacity = 255;
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int waterInput = Integer.parseInt(scanner.nextLine());

            if (capacity + waterInput <= tankCapacity)
                capacity += waterInput;

            else System.out.println("Insufficient capacity!");
        }

        System.out.println(capacity);
    }
}
