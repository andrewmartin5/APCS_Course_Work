 /**
 * This program takes the user's name, gender, and BMR as an input. It uses this information
 * to calculate the user's TDEE, or total daily energy expenditure.
 * 
 * @author Andrew Martin
 * @version 12/18/2020
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input
        // Name input
        System.out.print("Please enter your name: ");
        String firstName = in.next();
        String lastName = in.next();
        // Weight input
        System.out.print("Please enter your BMR: ");
        String BMRString = in.next();
        // Height input
        System.out.print("Enter your gender (M/F): ");
        String gender = in.next();
        
        // Determines if gender is M or F
        
        
        // Activity level input
        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)\n");
        System.out.print("Enter the letter corresponding to your activity level: ");
        String activityLevel = in.next();
        
        // Combines names into one string
        String name = firstName + " " + lastName;

        // Parses double from BMR String
        double BMRDouble = Double.parseDouble(BMRString);
        
        // Declares activityFactor to be used in the TDEE Calculation
        double activityFactor = 0;
        
        // Determines Activity Factor from activityLevel and gender
        if (activityLevel.equalsIgnoreCase("A")) {
            activityFactor = 1.0;
        }
        else if (activityLevel.equalsIgnoreCase("B")) {
            activityFactor = 1.3;
        }
        else if (activityLevel.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M")) {
            activityFactor = 1.6;
        }
        else if (activityLevel.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F")) {
            activityFactor = 1.5;
        }
        else if (activityLevel.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M")) {
            activityFactor = 1.7;
        }
        else if (activityLevel.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F")) {
            activityFactor = 1.6;
        }
        else if (activityLevel.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M")) {
            activityFactor = 2.1;
        }
        else if (activityLevel.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F")) {
            activityFactor = 1.9;
        }
        else if (activityLevel.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M")) {
            activityFactor = 2.4;
        }
        else if (activityLevel.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F")) {
            activityFactor = 2.2;
        }
        // If the user's input isn't correct, it tells them and ends the program
        else {
            activityFactor = 0;
            System.out.println("Sorry, please pick an option from the list");
            System.exit(0);
        }
        
        // Calculates TDEE
        double TDEE = BMRDouble * activityFactor;

        // Display results
        System.out.println("\n\nYour results:");
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + BMRDouble + " calories\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE);
    }
}