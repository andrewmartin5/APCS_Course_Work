
/**
 * This class defines a basic Terrain.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */

public class Terrain {
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    /**
     * Gets the length of a patch of terrain
     * 
     * @return Length of the terrain
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets the width of a patch of terrain
     * 
     * @return Width of the terrain
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets a description of a patch of terrain
     * 
     * @return A description of the terrain
     */
    public String getTerrainDesc() {
        return "Land has dimensions " + length + " X " + width;
    }
}