package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {


    public static void prog() {
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        final int rounds = 3;
        final var boundLength = 6;
        final var boundLengthPlus = 5;
        final var boundStart = 10;
        final var boundStep = 3;
        final var boundStepPlus = 1;
        final var boundMissing = 5;

        for (int i = 0; i < rounds; i++) {
            Random random = new Random();
            int length = random.nextInt(boundLength) + boundLengthPlus;
            int start = random.nextInt(boundStart);
            int step = random.nextInt(boundStep) + boundStepPlus;
            int missingIndex = random.nextInt(boundMissing);

            int[] progression = new int[length];
            for (int j = 0; j < length; j++) {
                progression[j] = start + j * step;
            }

            int missingValue = progression[missingIndex];
            progression[missingIndex] = -1;

            System.out.println("What number is missing in the progression?");
            System.out.print("Question: ");
            for (int j = 0; j < length; j++) {
                if (progression[j] == -1) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[j] + " ");
                }
            }
            System.out.println();

            System.out.println("Your answer: ");
            Scanner scan = new Scanner(System.in);
            int userAnswer = scan.nextInt();

            if (userAnswer == missingValue) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + missingValue);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
