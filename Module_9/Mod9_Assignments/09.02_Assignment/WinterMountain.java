/**
 * Creates a mountain object with a temperature variable
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */
public class WinterMountain extends Mountain {

    private double temperature;

    /**
     * Constructs a winter mountain object
     * 
     * @param l            Length of the mountain range
     * @param w            Width of the mountain range
     * @param numMountains Number of mountains
     * @param temp         Temperature of the mounains
     */
    public WinterMountain(int l, int w, int numMountains, double temp) {
        super(l, w, numMountains);

        temperature = temp;
    }

    /**
     * Gets the temperature of the mountains
     * 
     * @return The temperature of the mountains
     */
    public double getTemp() {
        return temperature;
    }

    /**
     * Gets a description of the mountains
     * 
     * @return A description of the mountains
     */
    public String getWinterMtnDesc() {
        return "Winter " + getMountainDesc() + " and temperature " + getTemp() + " degrees";
    }
}
