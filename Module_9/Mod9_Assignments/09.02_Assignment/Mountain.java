/**
 * Creates a mountain class with all of the functions of a terrain object with a
 * specified number of mountains
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */
public class Mountain extends Terrain {
    private int mountains;

    /**
     * Creates a mountain object
     * 
     * @param l            Length
     * @param w            Width
     * @param numMountains Number of mountains
     */
    public Mountain(int l, int w, int numMountains) {
        super(l, w);

        mountains = numMountains;
    }

    /**
     * Gets the number of mountains
     * 
     * @return The number of mountains in the range
     */
    public int getMountains() {
        return mountains;
    }

    /**
     * Gets a description of the mountians
     * 
     * @return A description of the mountain
     */
    public String getMountainDesc() {
        return "Mountain " + getTerrainDesc() + " and has " + mountains + " mountains";
    }

}
