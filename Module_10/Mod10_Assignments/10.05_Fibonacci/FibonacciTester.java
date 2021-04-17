import java.util.Scanner;

/**
 * This class tests the vibonacci calculater by providing a user interface to
 * calculate fibonacci numbers based on the location in the sequence.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/16/2021
 */
public class FibonacciTester {
    public static void main(String[] args) {
        boolean isRepeating = true;
        Scanner userIn = new Scanner(System.in);
        int input = 0;
        while (isRepeating) {
            System.out.println("To calculate a fibonacci number, please press 1. To exit, press 2: ");
            input = Integer.parseInt(userIn.nextLine());
            if (input == 1) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.print(
                            "Please enter a number between 0 and 45 to calculate the number corresponding to that location in the fibonacci sequence: ");
                    input = Integer.parseInt(userIn.nextLine());
                    if (input >= 0 && input <= 45) {
                        System.out.println(FibonacciCalculator.calcFibonacci(input));
                        validInput = true;
                    } else {
                        System.out.println("Please enter a valid number.");
                    }
                }
            } else if (input == 2) {
                System.out.println("Goodbye");
                isRepeating = false;
            } else {
                System.out.println("Please try again");
            }
        }
    }
}