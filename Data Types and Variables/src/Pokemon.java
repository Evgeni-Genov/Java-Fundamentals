import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFa = Integer.parseInt(scanner.nextLine());

        int currentPower = startPokePower;

        int targetsCount = 0;

        while (currentPower >= distance) {
            currentPower -= distance;
            targetsCount++;

            if ((currentPower == startPokePower / 2.0) && exhaustionFa != 0) {
                currentPower /= exhaustionFa;
            }
        }

        System.out.println(currentPower);
        System.out.println(targetsCount);
    }
}
