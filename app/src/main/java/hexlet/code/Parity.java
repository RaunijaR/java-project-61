package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Parity {
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void parityCheck() {
        System.out.println("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var correctAnswers = 0;
        while (correctAnswers < 3) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            Scanner scann = new Scanner(System.in);
            var userAnswer = scann.nextLine();

            if (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.println(userAnswer + " is wrong answer ;(.\nLet`s try again, " + userName + "!");
                return;
            }
            var correctAnswer = isEven(randomNumber) ? "yes" : "no";
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++; }
                else {
                    System.out.println(userAnswer + " - wrong answer ;(. Correct answer was - " + correctAnswer);
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
            } System.out.println("Congratulations, " + userName + "!");

        }
    }
