import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int count = person / capacity;

        if (count * capacity < person) {
            count++;
        }

        System.out.println(count);


    }
}
