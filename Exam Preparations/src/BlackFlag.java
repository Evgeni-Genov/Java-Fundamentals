import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double plunderToThisMoment = 0;

        for (int i = 1; i <= days; i++) {
            plunderToThisMoment += dailyPlunder;

            if (i % 3 == 0) {
                plunderToThisMoment += 0.5 * dailyPlunder;
            }

            if (i % 5 == 0) {
                plunderToThisMoment *= 0.7;
            }
        }

        if (plunderToThisMoment >= expectedPlunder) {
            System.out.printf("AHoy! %.2f plunder gained",
                    plunderToThisMoment);

        } else {
            double percentOfTotalPlunder = (plunderToThisMoment / expectedPlunder) * 100;

            System.out.printf("Collectedd only %.2f%% of the plunder.",
                    percentOfTotalPlunder);
        }
    }
}
