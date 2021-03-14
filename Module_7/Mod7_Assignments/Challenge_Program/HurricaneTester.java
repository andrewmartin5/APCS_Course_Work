
/**
 * This project creates an arraylist of hurricanes and prints it out. It also 
 * calculates the categories of each hurricane, as well as the average, min, 
 * and max catefories, pressures, and wind speeds for a specific set of years.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/13/2021
 */

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester {
    public static void main(String[] args) throws IOException {
        // read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        int cat1s = 0;
        int cat2s = 0;
        int cat3s = 0;
        int cat4s = 0;
        int cat5s = 0;
        double avgCat = 0;
        int minimumCat = Integer.MAX_VALUE;
        int maximumCat = Integer.MIN_VALUE;
        double avgPressure = 0;
        int minimumPressure = Integer.MAX_VALUE;
        int maximumPressure = Integer.MIN_VALUE;
        double avgWindSpeed = 0;
        double minimumWindSpeed = Double.MAX_VALUE;
        double maximumWindSpeed = Double.MIN_VALUE;

        // count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        // initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];
        int[] cat = new int[numValues];

        // read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        // create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>(numValues);
        for (int i = 0; i < numValues; i++) {
            hurricanes.add(i, new Hurricane(years[i], names[i], months[i], cat[i], pressures[i], windSpeeds[i]));
        }

        // user prompted for range of years
        System.out.print("Enter a range of years in between 1995 and 2019 (XXXX XXXX): ");
        Scanner userIn = new Scanner(System.in);
        int startYear = Integer.parseInt(userIn.next());
        int endYear = Integer.parseInt(userIn.next());
        // Makes sure that the end date is greater than the start date and that the
        // years fall in the range from 1995 to 2019
        while (startYear > endYear || startYear < hurricanes.get(0).getYear()
                || endYear > hurricanes.get(numValues - 1).getYear()) {
            System.out.println(
                    "Remember, the end date must be greater than the start date, and the years must be between 1995 and 2019");
            System.out.print("Enter a range of years (XXXX XXXX): ");
            startYear = Integer.parseInt(userIn.next());
            endYear = Integer.parseInt(userIn.next());
        }

        // Finds the index of the first and last huricane
        int firstHurricane = 0;
        while (hurricanes.get(firstHurricane).getYear() != startYear) {
            firstHurricane++;
        }

        int lastHurricane = numValues - 1;
        while (hurricanes.get(lastHurricane).getYear() != endYear) {
            lastHurricane--;
        }
        lastHurricane++;

        // convert the windspeed, determine categories, calculate sums
        for (int i = 0; i < numValues; i++) {
            hurricanes.get(i).calcWindSpeedMPH();
            hurricanes.get(i).calcCat();
            if (i < lastHurricane && i > firstHurricane - 1) {
                if (hurricanes.get(i).getCat() == 1) {
                    cat1s++;
                } else if (hurricanes.get(i).getCat() == 2) {
                    cat2s++;
                } else if (hurricanes.get(i).getCat() == 3) {
                    cat3s++;
                } else if (hurricanes.get(i).getCat() == 4) {
                    cat4s++;
                } else {
                    cat5s++;
                }
                if (hurricanes.get(i).getCat() < minimumCat) {
                    minimumCat = hurricanes.get(i).getCat();
                }
                if (hurricanes.get(i).getCat() > minimumCat) {
                    maximumCat = hurricanes.get(i).getCat();
                }
                if (hurricanes.get(i).getPressure() < minimumPressure) {
                    minimumPressure = hurricanes.get(i).getPressure();
                }
                if (hurricanes.get(i).getPressure() > maximumPressure) {
                    maximumPressure = hurricanes.get(i).getPressure();
                }
                if (hurricanes.get(i).getWindspeed() < minimumWindSpeed) {
                    minimumWindSpeed = hurricanes.get(i).getWindspeed();
                }
                if (hurricanes.get(i).getWindspeed() > maximumWindSpeed) {
                    maximumWindSpeed = hurricanes.get(i).getWindspeed();
                }
                avgCat += hurricanes.get(i).getCat();
                avgPressure += hurricanes.get(i).getPressure();
                avgWindSpeed += hurricanes.get(i).getWindspeed();
            }
        }
        avgCat = avgCat / (lastHurricane - firstHurricane);
        avgPressure = avgPressure / (lastHurricane - firstHurricane);
        avgWindSpeed = avgWindSpeed / (lastHurricane - firstHurricane);

        // print the data
        System.out.println("                      Hurricanes " + startYear + " - " + endYear);
        System.out.println(" Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("======================================================================");
        for (int i = firstHurricane; i < lastHurricane; i++) {
            System.out.println(hurricanes.get(i).toString());
        }
        System.out.println("======================================================================");
        System.out.printf("       Average:           %-12.1f%-16.1f%8.2f%n", avgCat, avgPressure, avgWindSpeed);
        System.out.printf("       Minimum:           %-12d%-16d%8.2f%n", minimumCat, minimumPressure, minimumWindSpeed);
        System.out.printf("       Maximum:           %-12d%-16d%8.2f%n%n", maximumCat, maximumPressure,
                maximumWindSpeed);
        System.out.println("Summary of Categories:");
        System.out.printf("   Cat %1d: %3d%n", 1, cat1s);
        System.out.printf("   Cat %1d: %3d%n", 2, cat2s);
        System.out.printf("   Cat %1d: %3d%n", 3, cat3s);
        System.out.printf("   Cat %1d: %3d%n", 4, cat4s);
        System.out.printf("   Cat %1d: %3d%n", 5, cat5s);
    }
}