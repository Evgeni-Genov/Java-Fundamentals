import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double IvanChoMoney = Double.parseDouble(scanner.nextLine());
        int padawanCount = Integer.parseInt(scanner.nextLine());
        double lightsaberSinglePrice = Double.parseDouble(scanner.nextLine());
        double robeSinglePrice = Double.parseDouble(scanner.nextLine());
        double beltSinglePrice = Double.parseDouble(scanner.nextLine());

        double lightsabersTotalPrice = Math.ceil(padawanCount * 1.1) * lightsaberSinglePrice;
        double robesTotalPrice = padawanCount * robeSinglePrice;
        int freeBeltCnt = padawanCount / 6;
        double beltsTotalPrice = (padawanCount - freeBeltCnt) * beltSinglePrice;

        double finalPrice = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (finalPrice > IvanChoMoney) {
            double moneyNeed = finalPrice - IvanChoMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);

        }
    }
}
