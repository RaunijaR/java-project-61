package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void prog() {
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        int rounds = 3;

        for (int i = 0; i < rounds; i++) {
            int length = random.nextInt(6) + 5;
            int start = random.nextInt(10);
            int step = random.nextInt(3) + 1;
            int missingIndex = random.nextInt(5);

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
            int userAnswer = scanner.nextInt();

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
