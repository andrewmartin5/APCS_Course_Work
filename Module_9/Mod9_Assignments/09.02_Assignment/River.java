/**
 * Creates a River object with all of the features of water and terrain objects
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */
public class River extends Water {
    private int flow;

    public River(int l, int w, int d, int flowRate) {
        super(l, w, d);

        flow = flowRate;
    }

    /**
     * Gets the rate of flow in a body of water
     * 
     * @return Rate of Flow
     */
    public int getFlowRate() {
        return flow;
    }

    /**
     * Gets a description of a river object
     * 
     * @return A description of a river
     */
    public String getRiverDesc() {
        return "River " + getWaterDesc() + " and a flow rate of " + flow;
    }

}
