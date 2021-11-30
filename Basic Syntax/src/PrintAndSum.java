import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int st = Integer.parseInt(scanner.nextLine());
        int en = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = st; i <= en; i++) {
            sum += i;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
