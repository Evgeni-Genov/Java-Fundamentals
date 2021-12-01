package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");
        String initTitle = articleData[0];
        String initContent = articleData[1];
        String initAuthor = articleData[2];
        Article article = new Article(initTitle, initContent, initAuthor);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(": ");
            String command = tokens[0];
            String data = tokens[1];

            switch (command) {
                case "Edit":
                    article.edit(data);

                    break;

                case "ChangeAuthor":
                    article.changeAuthor(data);

                    break;

                case "Rename":
                    article.rename(data);

                    break;

            }
        }

        System.out.println(article.toString());

    }
}
