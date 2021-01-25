
/**
 * This program creates passwords with different characters specified by the user
 * through a menu. The length of the password is also determined by the user.
 * These paswords are saved to a text file, which is then read to give the user
 * their output.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 1/19/2021 
 *
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Password_Generator {
    public static void main(String[] args) throws IOException {
        // Initialize scanner
        Scanner in = new Scanner(System.in);

        // Initialize PrintWriter
        PrintWriter toFile = new PrintWriter(new File("passwords.txt"));

        // Initialize Random for the password generator
        Random randNumList = new Random();

        // Declare and initialize variables
        int userChoice = 0;
        int pwLength = 0;
        String password = "";
        int randNum = 0;

        // Password generator menu
        System.out.println("Password Generator");
        System.out.println("==============================================================");
        System.out.println("  [1] Only lowercase Letters                                 ");
        System.out.println("  [2] Upper and lowercase letters                            ");
        System.out.println("  [3] Letters (upper and lowercase) and numbers              ");
        System.out.println("  [4] Letters (upper and lowercase), numbers, and symbols    ");
        System.out.println("  [5] Quit                                                   ");
        System.out.println("==============================================================");

        // Prompt for a menu userChoice
        System.out.print("Enter Selection (1-5): ");
        userChoice = Integer.parseInt(in.nextLine());

        // Checks if userChoice is five
        while (userChoice != 5) {
            // Check that userChoice meets the criteria of 1-5
            while (userChoice < 1 || userChoice > 5) {
                System.out.println("Invalid option. Please try again.\n");
                System.out.print("Enter Selection (1-5): ");
                userChoice = Integer.parseInt(in.nextLine());
            }

            // If userChoice is corrected to five, loop terminates
            if (userChoice == 5) {
                break;
            }

            // Ask for password length
            System.out.print("Password Length (6 or more): ");
            pwLength = Integer.parseInt(in.nextLine());

            // Loop to ensure password length is greater than or equal to six
            while (pwLength <= 6) {
                System.out.println("  Password Length too short. Please try again.");
                System.out.print("Password Length (6 or more): ");
                pwLength = Integer.parseInt(in.nextLine());
            }

            /**
             * When the user chooses one through four, a random int is generated that
             * specifies a character. If statements detect if characters need to be skipped,
             * and the necissary int is added to the random value. The random int then is
             * converted to an char, which appends the password. This is repeated until the
             * password is at the password length specified by the user
             */

            if (userChoice == 1) {
                for (int loop = 0; loop < pwLength; loop++) {
                    randNum = randNumList.nextInt(26) + 97;
                    password += (char) (randNum);
                }
            }

            if (userChoice == 2) {
                for (int loop = 0; loop < pwLength; loop++) {
                    randNum = randNumList.nextInt(52) + 65;
                    if (randNum > 90) {
                        randNum += 6;
                    }
                    password += (char) (randNum);
                }
            }

            if (userChoice == 3) {
                for (int loop = 0; loop < pwLength; loop++) {
                    randNum = randNumList.nextInt(62) + 48;
                    if (randNum > 57) {
                        randNum += 7;
                    }
                    if (randNum > 90) {
                        randNum += 6;
                    }
                    password += (char) (randNum);
                }
            }

            if (userChoice == 4) {
                for (int loop = 0; loop < pwLength; loop++) {
                    randNum = randNumList.nextInt(78) + 48;
                    password += (char) (randNum);
                }
            }

            // Password is printed to passwords.txt to be read later
            toFile.println(password);

            // Password is then reset to a blank string
            password = "";

            // User is prompted to input another menu selection
            System.out.print("\nEnter Selection (1-5): ");
            userChoice = Integer.parseInt(in.nextLine());
        }

        // Close PrintWriter
        toFile.close();

        // Initialize File Scanner
        Scanner fromFile = new Scanner(new File("passwords.txt"));

        // Read passwords back from text file
        System.out.println("\nThank you for using the Password Generator.\n");
        System.out.println("Here are your randomly generated codes:");
        for (int loopCounter = 1; fromFile.hasNextLine(); loopCounter++) {
            System.out.println(loopCounter + "\t\t" + fromFile.nextLine());
        }

        // Close scanners
        in.close();
        fromFile.close();
    }
}