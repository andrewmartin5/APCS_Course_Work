/**
 * This Class creates catapults with the ability to launch objects at different
 * velocities and angles, as well as to calculate the distance travelled by a
 * projectile when given velocity and angle
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/2/2021
 */
public class Catapult {
    private static int velocity;
    private static int angle;
    private static double distance;

    /** Creates a Catapult object */
    public Catapult() {
        velocity = 0;
        angle = 0;
        distance = 0;
    }

    /**
     * Sets velocity
     * 
     * @param v // Velocity to set
     */
    public static void setVelocity(int v) {
        velocity = v;
    }

    /**
     * Sets angle
     * 
     * @param a // Angle to set
     */
    public static void setAngle(int a) {
        angle = a;
    }

    /**
     * Gets Velocity
     * 
     * @return Velocity
     */
    public static int getVelocity() {
        return velocity;
    }

    /**
     * Gets Angle
     * 
     * @return Angle
     */
    public static int getAngle() {
        return angle;
    }

    /**
     * Gets Distance
     * 
     * @return Distance
     */
    public static double getDistance() {
        return distance;
    }

    /**
     * Calculates Distance from velocity and angle
     * 
     * @param v Velocity
     * @param a Angle
     * @return Calculated Distance
     */
    public double calcDistance(int v, int a) {
        velocity = v;
        angle = a;
        distance = (Math.pow(velocity, 2) * Math.sin(Math.toRadians(2 * angle))) / 9.8;
        return distance;
    }
}