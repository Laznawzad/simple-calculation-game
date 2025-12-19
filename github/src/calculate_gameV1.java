import java.util.Scanner;
import java.util.Random;
public class calculate_gameV1 {
    static Random ran = new Random();
    static Scanner ask = new Scanner(System.in);
    static int life ;
    public static void main(String[] args){
        int Number1 = 0;
        int Number2 = 0;
        char operator = '0';

        int choice = 0;
        while (choice != 4 ){


            System.out.print("""
                welcome to the calculating game
                1-easy
                2-medium
                3-hard
                4-exit
                please choose your difficulty:""");
            choice = ask.nextInt();

            switch (choice){
                case 1:
                    easyDifficulty(Number1 , Number2);
                    break;
                case 2:
                    mediumDifficulty(Number1, Number2);
                    break;
                case 3:
                    hardDifficulty(Number1, Number2);
                    break;
                case 4:
                    System.out.println("have a nice day");
                    break;
                default:
                    System.out.println("invalid number");
            }


        }

    }
    public static void easyDifficulty(int number1, int number2){
        life = 1;
        int result = 0;
        int userAnswer;

        while (life > 0){
            number1 = ran.nextInt(1,201);
            number2 = ran.nextInt(1,201);
            char[] operators = {'+', '-', '*'};
            char op = operators[ran.nextInt(operators.length)];
            result = switch (op) {
                case '+' -> number1 + number2;
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                default -> result;
            };

            System.out.print("what is" + number1 + op +number2 + ":");
            userAnswer = ask.nextInt();
            if (userAnswer != result){
                life--;
                System.out.println("the answer was wrong you have this " + life + " left");


            }




        }

    }
    public static void mediumDifficulty(int number1, int number2){
        life = 3;
        int result = 0;
        int userAnswer;

        while (life > 0){
            number1 = ran.nextInt(1,501);
            number2 = ran.nextInt(1,501);
            char[] operators = {'+', '-', '*'};
            char op = operators[ran.nextInt(operators.length)];
            result = switch (op) {
                case '+' -> number1 + number2;
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                default -> result;
            };

            System.out.print("what is" + number1 + op +number2 + ":");
            userAnswer = ask.nextInt();
            if (userAnswer != result){
                life--;
                System.out.println("the answer was wrong you have this " + life + " left");


            }




        }

    }
    public static void hardDifficulty(int number1, int number2){
        life = 5;
        int result = 0;
        int userAnswer;

        while (life > 0){
            number1 = ran.nextInt(1,1001);
            number2 = ran.nextInt(1,1001);
            char[] operators = {'+', '-', '*'};
            char op = operators[ran.nextInt(operators.length)];
            result = switch (op) {
                case '+' -> number1 + number2;
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                default -> result;
            };

            System.out.print("what is" + number1 + op +number2 + ":");
            userAnswer = ask.nextInt();
            if (userAnswer != result){
                life--;
                System.out.println("the answer was wrong you have this " + life + " left");


            }




        }

    }

}
