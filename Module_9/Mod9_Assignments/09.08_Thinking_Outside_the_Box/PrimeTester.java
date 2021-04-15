import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class allows a user to input a range and calculates all prime numbers
 * between these numbers. It then prints these numbers to a file. Also, there's
 * a pretty fancy (if I say so) progress bar
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/14/2021
 */
public class PrimeTester {

    /**
     * Returns a progress bar string that visually displays a percentage of a total
     * 
     * @param current The current value to calculate the percentage with
     * @param total   The total value to calculate percentage with
     * @return A string with a progress bar and a percentage of the total
     */
    private static String progressBar(int current, int total) {
        int percent = (current * 100) / (total);
        String bar = "|";
        for (int i = 0; i < percent / 5; i++) {
            bar += "=";
        }
        for (int index = 0; index < 20 - percent / 5; index++) {
            bar += " ";
        }
        bar += "| " + percent + "%\r";
        return bar;
    }

    /**
     * Finds all prime numbers within a range and prints them to a file
     * 
     * @param min Minimum value of the list of primes
     * @param max Maximum value of the list of primes
     * @return An int array with all found prime numbers
     * @throws IOException In case the file can't be found for the printwriter
     */
    private static int[] primeFinder(int min, int max) throws IOException {
        // Define an initial integer arraylist
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // Create printwriter to be used later
        PrintWriter toFile = new PrintWriter("primeNums.txt");

        // Adds all numbers between zero and the max bound
        System.out.println("Initializing Numbers:");
        for (int i = 0; i < max; i++) {
            nums.add(i + 1);
            System.out.print(progressBar(i, max));
        }
        System.out.println("|====================| 100%");

        // Removes all numbers divisible by 2, 3, and 5; this narrows down the list so
        // the main algorithm doesn't have to do as much work
        System.out.println("Primary NonPrime Removal:");
        int numBar = 0;
        for (int i = 0; i < nums.size(); i++) {
            int currentNum = nums.get(i);
            if (i < nums.size()) {
                numBar++;
            }
            if ((currentNum != 2 && currentNum != 3 && currentNum != 5)
                    && (currentNum % 2 == 0 || currentNum % 3 == 0 || currentNum % 5 == 0)) {
                nums.remove(i);
                i--;
            }
            System.out.print(progressBar(i, nums.size()));
        }
        System.out.println("|====================| 100%");

        // Removes all non prime numbers by checking divisibility by all previous prime
        // numbers
        System.out.println("Finalizing Primes:");
        for (int currentLoc = 0; currentLoc < nums.size(); currentLoc++) {
            for (int testLoc = 1; testLoc < currentLoc - 1; testLoc++) {
                if (nums.get(currentLoc) % nums.get(testLoc) == 0) {
                    nums.remove(currentLoc);
                    currentLoc--;
                }
            }
            System.out.print(progressBar(currentLoc, nums.size()));
        }
        System.out.println("|====================| 100%");

        // Removes all numbers beneath the lower bounds
        System.out.println("Setting Lower Bounds:");
        for (int i = 0; i < nums.size() && nums.get(i) < min; i++) {
            if (nums.get(i) < min) {
                nums.remove(i);
                i--;
            }
            System.out.print(progressBar(i, nums.size()));
        }
        System.out.println("|====================| 100%");

        // Changes arraylist to array and prints prime numbers into a file
        System.out.println("Printing to file:");
        int[] primes = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            toFile.print(nums.get(i) + " ");
            primes[i] = nums.get(i);
            System.out.print(progressBar(i, nums.size()));
        }
        System.out.println("|====================| 100%");
        System.out.println("Your " + primes.length + " Prime Numbers between " + min + " and " + max
                + " can be found in a file named primeNums");
        // Close Print Writer
        toFile.close();
        return primes;
    }

    public static void main(String[] args) throws IOException {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Welcome To The Prime Number Finder!");
        System.out.print("Please Enter a Minimum Bounding: ");
        int lowerBound = Integer.parseInt(userIn.next());
        System.out.print("Please Enter a Maximum Bounding: ");
        int upperBound = Integer.parseInt(userIn.next());
        primeFinder(lowerBound, upperBound);
        userIn.close();
    }
}
