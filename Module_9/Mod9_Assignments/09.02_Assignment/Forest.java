/**
 * This class creates forest objects with length, width, and a specified number
 * of trees
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */
public class Forest extends Terrain {

    private int trees;

    /**
     * Creates a forest object with length width and trees
     * 
     * @param l        Length
     * @param w        Width
     * @param numTrees Number of trees
     */
    public Forest(int l, int w, int numTrees) {
        super(l, w);

        trees = numTrees;
    }

    /**
     * Gets the number of trees in a forest
     * 
     * @return Number of trees
     */
    public int getTrees() {
        return trees;
    }

    /**
     * Gets a basic description of a forest
     * 
     * @return A description of the forest
     */
    public String getForestDesc() {
        return "Forest " + getTerrainDesc() + " and has " + trees + " trees";
    }

}
