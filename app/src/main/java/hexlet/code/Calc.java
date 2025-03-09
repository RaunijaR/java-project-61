package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {

    private static char getRandomOperator() {
        char[] operators = {'*', '+', '-'};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    private static int calculate(int firstInt, int secondInt, char operator) {
        switch (operator) {
            case '+':
                return firstInt + secondInt;
            case '-':
                return firstInt - secondInt;
            case '*':
                return firstInt * secondInt;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
        public static void calc() {
            System.out.print("May I have your name? ");

            Scanner scanner = new Scanner(System.in);
            var userName = scanner.next();

            System.out.println("Hello, " + userName + "!");

            System.out.println("What is the result of the expression?");

            var gameWin = 3;
            var bound = 200;
            var correctAnswers = 0;
            while (correctAnswers < gameWin) {
                Random random = new Random();
                int firstInt = random.nextInt(bound);
                int secondInt = random.nextInt(bound);
                char operator = getRandomOperator();

                var correctAnswer = calculate(firstInt, secondInt, operator);

                System.out.println("Question: " + firstInt + " " + operator + " " + secondInt);
                System.out.print("Your answer: ");

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
