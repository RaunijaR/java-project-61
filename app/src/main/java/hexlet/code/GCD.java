package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    private static int getGcd(int firstInt, int secondInt) {
        int gcd = 1;
        for (int i = 1; i <= firstInt && i <= secondInt; i++) {
            if (firstInt % i == 0 && secondInt % i == 0) {
                gcd = i;
            }
        } return gcd; }

    public static void gcd() {
        System.out.println("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        System.out.println("Find the greatest common divisor of given numbers.");

        var correctAnswers = 0;
        while (correctAnswers < 3) {
            Random random = new Random();
            int firstInt = random.nextInt(100);
            int secondInt = random.nextInt(100);

            var correctAnswer = getGcd(firstInt, secondInt);

            System.out.println("Question: " + firstInt + " " + secondInt);
            System.out.println("Your answer: ");

            Scanner scan = new Scanner(System.in);
            var userAnswer = scan.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " - wrong answer ;(. Correct answer was - " + correctAnswer);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
