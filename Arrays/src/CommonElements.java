import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String elementOne : arr2) {
            for (String elementTwo : arr1) {
                if (elementOne.equals(elementTwo)) {
                    System.out.print(elementOne + " ");
                }

            }

        }

    }
}
