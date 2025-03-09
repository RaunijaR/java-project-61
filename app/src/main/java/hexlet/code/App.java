package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var greet = 1;
        var even = 2;
        final var calc = 3;
        final var gcd = 4;
        final var progression = 5;
        final var prime = 6;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        var gameNumber = scanner.nextInt();
        if (gameNumber == greet) {
            System.out.println("Your choice: 1");
            System.out.println("Welcome to the Brain Games!");
            Cli.start();
        } else if (gameNumber == even) {
            System.out.println("Your choice: 2");
            System.out.println("Welcome to the Brain Games!");
            Parity.parityCheck();
        } else if (gameNumber == calc) {
            System.out.println("Your choice: 3");
            System.out.println("Welcome to the Brain Games!");
            Calc.calc();
        } else if (gameNumber == gcd) {
            System.out.println("Your choice: 4");
            System.out.println("Welcome to the Brain Games!");
            GCD.gcd();
        } else if (gameNumber == progression) {
            System.out.println("Your choice: 5");
            System.out.println("Welcome to the Brain Games!");
            Progression.prog();
        } else if (gameNumber == prime) {
            System.out.println("Your choice: 6");
            System.out.println("Welcome to the Brain Games!");
            Prime.prime();
        }
    }
}
