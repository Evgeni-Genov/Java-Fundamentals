import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            if (isTopNumber(i))
                System.out.println(i);
        }

    }

    public static boolean isTopNumber(int num) {
        int sum = 0;
        boolean hasOddDigit = false;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;

            if (digit % 2 != 0)
                hasOddDigit = true;
        }

        if (sum % 8 == 0 && hasOddDigit)
            return true;

        return false;
    }
}
