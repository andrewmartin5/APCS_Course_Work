/**
 * This program takes first and last name, height (in feet and inches), weight in lbs, and
 * calculates the user's BMI.
 * 
 * @author Andrew Martin
 * @version 12/18/2020
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //Input
        //Name input
        System.out.print("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.next();
        //Weight input
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weightLbsString = in.next();
        //Height input
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heightFeetString = in.next();
        String heightInchesString = in.next();
        
        //Combines names into one string
        String name = firstName + " " + lastName;

        //Parse numeric input from strings
        int heightFt = Integer.parseInt(heightFeetString);
        int heightIn = Integer.parseInt(heightInchesString);
        int weightLbs = Integer.parseInt(weightLbsString);

        //Convert height and weight and rounds to nearest tenth
        double heightMeters = (int)(10 * ((heightFt * 12) + heightIn) * 0.0254)/10.0;
        double weightKg = (int)(10 * weightLbs * 0.45359237)/10.0;
        
        //Calculates BMI and rounds to nearest tenth
        double BMI = (int)(10 * (weightKg / Math.pow(heightMeters, 2)))/10.0;
        
        //Determines BMI Category
        String category = "error";
        if (BMI < 18.5)
            category = "Underweight";
        else if (BMI < 25)
            category = "Normal";
        else if (BMI < 30)
            category = "Overweight";
        else
            category = "Obese";
        

        //Display results
        System.out.println("\n\nBody Mass Index Calculator\n==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightMeters);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + category);
    }
}