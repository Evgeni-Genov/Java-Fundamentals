import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] train = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];

        }

        for (int waggon : train) {
            System.out.print(waggon + " ");

        }

        System.out.println();
        System.out.println(sum);
    }
}
