
/**
 * This class tests the encryption and decryption classes and allows a user to encrypt and decrypt messages
 * @author Andrew Martin
 * @version 1.0
 * @since 4/13/2021
 */
import java.util.Scanner;

public class CaesarTester {
    public static void main(String[] args) {
        boolean isFinished = false;
        Scanner userIn = new Scanner(System.in);
        String input = "";
        System.out.println("                    CAESAR SHIFT                   ");
        System.out.println("===================================================");
        while (!isFinished) {
            System.out.println("Options:\n1. Encrypt\n2. Decrypt\n3. Exit");
            input = userIn.next();
            if (input.equals("1")) {
                System.out.println("Please enter an offset for your cypher (Between 0 and 26):");
                input = userIn.next();
                while (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 26) {
                    System.out.println("Please enter an offset for your cypher (Between 0 and 26):");
                    input = userIn.next();
                }
                Encryption.generateCypher(Integer.parseInt(input));
                System.out.println("Please enter a string to encode:");
                System.out.println("Your encrypted string is: " + Encryption.encryptString(userIn.next()));
            } else if (input.equals("2")) {
                System.out.println("Please enter an offset for your cypher (Between 0 and 26):");
                input = userIn.next();
                while (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 26) {
                    System.out.println("Please enter an offset for your cypher (Between 0 and 26):");
                    input = userIn.next();
                }
                Decryption.generateCypher(Integer.parseInt(input));
                System.out.println("Please enter a string to decode:");
                System.out.println("Your encrypted string is: " + Decryption.decryptString(userIn.next()));
            } else if (input.equals("3")) {
                System.out.println("Goodbye");
                isFinished = true;
            } else
                System.out.println("Please enter a valid input");
        }
        userIn.close();
    }
}
