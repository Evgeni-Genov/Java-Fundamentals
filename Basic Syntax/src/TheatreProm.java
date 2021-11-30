import java.util.Scanner;

public class TheatreProm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (dayType.equals("Weekday")) {
            if (0 <= age && age <= 18) {
                price = 12;

            } else if (18 < age && age <= 64) {
                price = 64;

            } else if (64 < age && age <= 122) {
                price = 12;
            }

        } else if (dayType.equals("Weekend")) {
            if (0 <= age && age <= 18) {
                price = 15;

            } else if (18 < age && age <= 64) {
                price = 20;

            } else if (64 < age && age <= 122) {
                price = 15;
            }

        } else if (dayType.equals("Holiday")) {
            if (0 <= age && age <= 18) {
                price = 25;

            } else if (18 < age && age <= 64) {
                price = 12;

            } else if (64 < age && age <= 122) {
                price = 10;
            }
        }

        if (price == 0) System.out.println("Error");

        else System.out.println(price + "$");
    }
}
