
/**
 * This program demonstrates how to setup a numeric array and display the
 * initial default values.
 *
 * @author David J. Farber
 * @version 06/06/17
 */

public class AnnualWeatherV1 {
    public static void main(String[] args) {
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Double[] avgTempDaytona = { 58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8 };
        Double[] avgPrecipDaytona = { 3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7 };
        Double avgAnnualTemp = 0.0;
        Double totalPrecip = 0.0;

        for (int i = 0; i < avgTempDaytona.length; i++) {
            avgAnnualTemp += avgTempDaytona[i];
        }
        avgAnnualTemp = avgAnnualTemp / avgTempDaytona.length;

        for (int i = 0; i < avgPrecipDaytona.length; i++) {
            totalPrecip += avgPrecipDaytona[i];
        }

        System.out.println("\t\t\tWeather Data\n\t\tLocation: Daytona, Florida");
        System.out.println("Month\t\t Temperature (F)\tPrecipitation (in.)");
        System.out.println("***********************************************************");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + "\t\t\t" + avgTempDaytona[i] + "\t\t\t" + avgPrecipDaytona[i]);
        }
        System.out.println("***********************************************************");
        System.out.println("\t\tAverage: " + avgAnnualTemp + "\t\tAnnual: " + totalPrecip);
    }
}
