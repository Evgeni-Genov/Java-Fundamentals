import java.util.*;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String treasureChestContent = scanner.nextLine();
        String[] splitChest = treasureChestContent.split("\\|");

        List<String> items = new ArrayList<>(Arrays.asList(splitChest));

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split(" ");
            String currentCommand = tokens[0];
            switch (currentCommand) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        if (!items.contains(tokens[i])) {
                            items.add(0, tokens[i]);
                        }
                    }

                    break;

                case "Drop":
                    int dropIndex = Integer.parseInt(tokens[1]);
                    if (dropIndex < 0 || dropIndex >= items.size()) {

                        break;

                    }

                    items.add(items.remove(dropIndex));

                    break;

                case "Steal":
                    int stealAmount = Integer.parseInt(tokens[1]);

                    List<String> stolen = new ArrayList<>();
                    String output = "";
                    if (stealAmount >= items.size()) {
                        output = String.join(", ", items);
                        System.out.println(output);
                        items.clear();
                        break;
                    }

                    for (int i = 0; i < stealAmount; i++) {
                        int lastIndex = items.size() - 1;
                        stolen.add(items.remove(lastIndex));
                    }

                    Collections.reverse(stolen);
                    output = String.join(", ", stolen);
                    System.out.println(output);

                    break;
            }

            command = scanner.nextLine();

        }

        int totalSizeOfLoot = 0;
        for (String currentLoot : items) {
            totalSizeOfLoot += currentLoot.length();
        }

        if (totalSizeOfLoot == 0) {
            System.out.println("Failed treasure hunt.");

        } else {
            double average = 1.0 * totalSizeOfLoot / items.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }

    }


}
