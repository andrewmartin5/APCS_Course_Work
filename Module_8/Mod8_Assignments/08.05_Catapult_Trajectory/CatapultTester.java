/**
 * This class is a tester class for the catipult class. This class uses 2d
 * arrays to store calculated values for distances.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/2/2021
 */
public class CatapultTester {
    static int[] velocities = new int[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
    static int[] angles = new int[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90 };
    static double[][] distances = new double[velocities.length][angles.length];

    public static void main(String[] args) {
        Catapult orangeLauncher = new Catapult();
        for (int row = 0; row < distances.length; row++) {
            for (int column = 0; column < distances[row].length; column++) {
                distances[row][column] = orangeLauncher.calcDistance(velocities[row], angles[column]);
            }
        }
        System.out.println("                           Projectile Distance (meters)");
        System.out.printf("%6s", "MPS");
        for (int i = 0; i < angles.length; i++) {
            System.out.printf("%12s", angles[i] + " deg");
        }
        System.out.println();
        for (int i = 0; i < angles.length; i++) {
            System.out.print("============");
        }
        System.out.println("=========");
        for (int i = 0; i < velocities.length; i++) {
            System.out.printf("%6d", velocities[i]);
            for (int index = 0; index < distances[i].length; index++) {
                System.out.printf("%12.1f", distances[i][index]);
            }
            System.out.println();
        }
    }
}
