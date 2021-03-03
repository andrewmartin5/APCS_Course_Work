import java.util.Scanner;

/**
 * This program demonstrates how to setup a numeric array and display the
 * initial default values.
 *
 * @author David J. Farber
 * @version 06/06/17
 */

public class AnnualWeatherV2 {

    // Converts a double array from Fahrenheit to Celsius
    public static Double[] toCelsius(Double[] tempInFahrenheit) {
        Double[] tempInCelsius = tempInFahrenheit;
        for (int i = 0; i < tempInFahrenheit.length; i++) {
            tempInCelsius[i] = (tempInFahrenheit[i] - 32.0) * 5.0 / 9.0;
        }
        return tempInCelsius;
    }

    // Converts a double array from Inches to Centimeters
    public static Double[] toCentimeters(Double[] lengthInInches) {
        Double[] lengthInCentimeters = lengthInInches;
        for (int i = 0; i < lengthInInches.length; i++) {
            lengthInCentimeters[i] = lengthInInches[i] * 2.54;
        }
        return lengthInCentimeters;
    }

    public static void main(String[] args) {
        // Initialize variables
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Double[] avgTempDaytona = { 58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8 };
        Double[] avgPrecipDaytona = { 3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7 };
        Double avgAnnualTemp = 0.0;
        Double totalPrecip = 0.0;
        String tempScale = "";
        String precipScale = "";
        Scanner userIn = new Scanner(System.in);

        // Takes user input of a temperature scale and filters inputs
        while (!tempScale.equalsIgnoreCase("c") && !tempScale.equalsIgnoreCase("f")) {
            System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
            tempScale = userIn.nextLine();
            if (!tempScale.equalsIgnoreCase("c") && !tempScale.equalsIgnoreCase("f")) {
                System.out.println("Sorry, that is not a temperature unit. Please try again.");
            }
        }

        // Line for spacing
        System.out.println("");

        // Takes user input of a length scale and filters inputs
        while (!precipScale.equalsIgnoreCase("c") && !precipScale.equalsIgnoreCase("i")) {
            System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
            precipScale = userIn.nextLine();
            if (!precipScale.equalsIgnoreCase("c") && !precipScale.equalsIgnoreCase("i")) {
                System.out.println("Sorry, that is not a precipitation unit. Please try again.");
            }
        }

        // Closes scanner
        userIn.close();

        // Converts to celsius
        if (tempScale.equalsIgnoreCase("c")) {
            avgTempDaytona = toCelsius(avgTempDaytona);
        }

        // Converts to centimeters
        if (precipScale.equalsIgnoreCase("c")) {
            avgPrecipDaytona = toCentimeters(avgPrecipDaytona);
        }

        // Converts precipitation scale to a more readable format for output
        if (precipScale.equalsIgnoreCase("c"))
            precipScale = "cm.";
        else
            precipScale = "in.";

        // Calculates average temperature and total precipitation
        for (int i = 0; i < avgTempDaytona.length; i++) {
            avgAnnualTemp += avgTempDaytona[i];
        }
        avgAnnualTemp = avgAnnualTemp / avgTempDaytona.length;

        for (int i = 0; i < avgPrecipDaytona.length; i++) {
            totalPrecip += avgPrecipDaytona[i];
        }

        // Prints all output
        System.out.println("\t\t\tWeather Data\n\t\tLocation: Daytona, Florida");
        System.out.println(
                "Month\t\t Temperature ( " + tempScale.toUpperCase() + " )\tPrecipitation (" + precipScale + ")");
        System.out.println("***********************************************************");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%3s\t\t\t%4.1f\t\t\t%4.1f%n", months[i], avgTempDaytona[i], avgPrecipDaytona[i]);
        }
        System.out.println("***********************************************************");
        System.out.printf("\t       Average: %4.1f\t       Annual: %5.1f", avgAnnualTemp, totalPrecip);
    }
}
