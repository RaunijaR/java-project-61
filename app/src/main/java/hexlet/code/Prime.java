package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static String isPrime(int n) {
        if (n < 2) return "no";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return "no";
        }
        return "yes";
    }

    public static void prime() {
        System.out.println("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();

        System.out.println("Hello, " + userName+"!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        var correctAnswers = 0;
        while (correctAnswers < 3) {
            Random random = new Random();
            int num = random.nextInt(50);
            var correctAnswer = isPrime(num);

            System.out.println("Question: " + num);
            System.out.println("Your answer: ");

            Scanner scan = new Scanner(System.in);
            var userAnswer = scan.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        }
    }
