import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int area = calculateArea(width, height);

        printArea(area);
    }

    private static void printArea(int area) {
        System.out.println("The are is: " + area);
    }

    private static int calculateArea(int a, int b) {
        return a * b;
    }
}
