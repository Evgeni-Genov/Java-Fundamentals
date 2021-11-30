import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int n = 1;

        while (n <= 10) {
            System.out.printf("%d X %d=%d%n", number, n, number * n);
            n++;
        }
    }
}
