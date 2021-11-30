import java.util.Scanner;

public class ZigZagArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstEl = input[0];
            String secondEl = input[1];

            if (i % 2 == 0) {
                firstArr[i] = firstEl;
                secondArr[i] = secondEl;

            } else {
                firstArr[i] = secondEl;
                secondArr[i] = firstEl;
            }
        }

        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
