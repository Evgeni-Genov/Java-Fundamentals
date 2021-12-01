import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] splitCommand = command.split(":");
            switch (splitCommand[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(splitCommand[1]);
                    if (validIndex(stops, index)) {
                        String firstPart = stops.substring(0, index);
                        String secondPart = stops.substring(index);
                        stops = firstPart.concat(splitCommand[2]).concat(secondPart);

                    }
                    System.out.println(stops);

                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(splitCommand[1]);
                    int endIndex = Integer.parseInt(splitCommand[2]);

                    if (validIndex(stops, startIndex) && validIndex(stops, endIndex)) {
                        String toRemove = stops.substring(startIndex, endIndex + 1);
                        stops = stops.replace(toRemove, "");


                    }
                    System.out.println(stops);

                    break;

                case "Switch":
                    if (stops.contains(splitCommand[1])) {
                        stops = stops.replace(splitCommand[1], splitCommand[2]);

                    }
                    System.out.println(stops);

                    break;

            }

            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }

    public static boolean validIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return true;
        }

        return false;
    }
}
