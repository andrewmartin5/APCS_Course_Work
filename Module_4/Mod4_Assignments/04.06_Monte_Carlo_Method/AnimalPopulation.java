
/**
 * This program simulates animal sightings, saves them to a file, then uses that file
 * to determine the average number of animals spotted before the signing of the tracked
 * animal
 * 
 * Pseudocode:
 * 1) create scanner and printwriter objects
 * 2) Print introduction and get the number of trials from the user
 * 3) Use a loop to ensure that user input is over 1000
 * 4) Run trials (it should take 12 average searches so it needs to be an average of
 * numbers between 1 and 24) and write output to file
 * 5) Read trials from file and calculate average
 * 6) Display output
 *
 * @author Andrew Martin
 * @version 1/18/2021
 */
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AnimalPopulation {
    public static void main(String[] args) throws IOException {
        // Creates Scanner and Printwriters
        Scanner userIn = new Scanner(System.in);
        Random randomize = new Random();
        PrintWriter toFile = new PrintWriter(new File("RabbitSightings.txt"));

        // Gets user input
        System.out.println("Welcome to the Albino Rabbit Simulator\n");
        System.out.println("How many trials should be simulated?\n");
        System.out.print("Enter a value greater than 1000: ");
        String numTrialsString = userIn.nextLine();
        int numTrials = Integer.parseInt(numTrialsString);

        // Ensures that the user's input is greater than 1000
        while (numTrials <= 1000) {
            System.out.print("\nPlease try again. Enter a value greater than 1000: ");
            numTrialsString = userIn.nextLine();
            numTrials = Integer.parseInt(numTrialsString);
        }

        // Lets user know that computer is simulating trials
        System.out.println("\nsimulating trials now... one moment please...\n");

        // Simulates user trials
        for (int trialsDone = 0; trialsDone < numTrials; trialsDone++) {
            // Simulates random number between 1 and 12
            int randInt = randomize.nextInt(24) + 1;
            toFile.println(randInt);
        }

        // Closes toFile to allow fromFile to access the file RabbitSightings.txt
        toFile.close();
        Scanner fromFile = new Scanner(new File("RabbitSightings.txt"));
        String token = "0";
        int avgSum = 0;
        while (fromFile.hasNextLine()) {
            token = fromFile.nextLine();
            avgSum += Integer.parseInt(token);
        }

        double avgSightings = (double) avgSum / (double) numTrials;

        System.out.println("The results!");
        System.out.println(
                "The average number of squirrels observed until\nspotting an albino rabbit is: " + avgSightings);

        // Closes Scanners and PrintWriters
        userIn.close();
        fromFile.close();
    }// End of main method
}// End of class