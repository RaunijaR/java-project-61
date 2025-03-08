package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void start() {
        System.out.println("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
