/**
 * Creates a Water object that has all of the features of a terrain object
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */
public class Water extends Terrain {
    private int depth;

    /**
     * Creates a water object
     * 
     * @param l The length of the body of water
     * @param w The width of the body of water
     * @param d The depth of the body of water
     */
    public Water(int l, int w, int d) {
        super(l, w);

        depth = d;
    }

    /**
     * Gets the depth of a body of water
     * 
     * @return Depth of the body of water
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Gets a desctiption of the body of water
     * 
     * @return A description of the water
     */
    public String getWaterDesc() {
        return "Water has dimensions " + getLength() + " X " + getWidth() + " and a depth of " + depth;
    }

}
