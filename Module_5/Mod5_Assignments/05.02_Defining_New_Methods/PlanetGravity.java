
/**
 * This program calculates and prints out planet's gravities. It uses diameter
 * (in Km) and mass (in Kg), converts from scientific format to a normal double
 * value, then calculates the gravity of a planet and prints the output.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 1/29/2021
 *
 */

public class PlanetGravity {
    // Transforms strings in scientific format to doubles
    public static double fromScientificToDouble(String scientific) {
        double output = Double.parseDouble(scientific.substring(0, scientific.indexOf("e")));
        output *= Math.pow(10, Integer.parseInt(scientific.substring(scientific.indexOf("e") + 1)));
        return output;
    }

    // Calculates gravity given diameter and mass
    public static double calculateGravity(double d, String m) {
        double output = (fromScientificToDouble("6.67e-11") * fromScientificToDouble(m)) / (Math.pow(500 * d, 2));
        // Rounds to nearest hundredth
        output = Double.parseDouble(Double.toString(output).substring(0, Double.toString(output).indexOf(".") + 3));
        return output;
    }

    // Prints output to terminal
    public static void printPlanet(String name, String diameter, String mass, String g) {
        System.out.println("  " + name + "\t\t" + diameter + "\t\t" + mass + "\t" + g);
    }

    public static void main(String[] args) {
        // Header
        System.out.println("  \t\t\t     Planetary Data");
        System.out.println("  Planet\t\tDiameter (km)\tMass (kg)\tg (m/s^2)");
        System.out.println("-------------------------------------------------------------------");
        // Calculates and prints out planet information
        printPlanet("Mercury", "4880", "3.30e23 ", Double.toString(calculateGravity(4880.0, "3.30e23")));
        printPlanet("Venus ", "12103.6", "4.869e24", Double.toString(calculateGravity(12103.6, "4.869e24")));
        printPlanet("Earth ", "12756.3", "5.972e24", Double.toString(calculateGravity(12756.3, "5.972e24")));
        printPlanet("Mars  ", "6794", "6.4219e23", Double.toString(calculateGravity(6794, "6.4219e23")));
        printPlanet("Jupiter", "142984", "1.900e27", Double.toString(calculateGravity(142984, "1.900e27")));
        printPlanet("Saturn", "120536", "5.68e26 ", Double.toString(calculateGravity(120536, "5.68e26")));
        printPlanet("Uranus", "51118", "8.683e25", Double.toString(calculateGravity(51118, "8.683e25")));
        printPlanet("Neptune", "49532", "1.0247e26", Double.toString(calculateGravity(49532, "1.0247e26")));
    }
}