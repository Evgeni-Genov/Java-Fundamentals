import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        printSmallest(a, b, c);
    }

    private static void printSmallest(int a, int b, int c) {
        int smallest = a;

        if (a > b)
            smallest = b;

        if (b > c)
            smallest = c;

        System.out.println(smallest);
    }
}
