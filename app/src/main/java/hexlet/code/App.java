package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        var gameNumber = scanner.nextInt();
        if (gameNumber == 1) {
            System.out.println("Your choice: 1");
            System.out.println("Welcome to the Brain Games!");
            Cli.start();
        } else if (gameNumber == 2) {
            System.out.println("Your choice: 2");
            System.out.println("Welcome to the Brain Games!");
            Parity.parityCheck();
        } else if (gameNumber == 3) {
            System.out.println("Your choice: 3");
            System.out.println("Welcome to the Brain Games!");
            Calc.calc();
        } else if (gameNumber == 4) {
            System.out.println("Your choice: 4");
            System.out.println("Welcome to the Brain Games!");
            GCD.gcd();
        }
    }
}
