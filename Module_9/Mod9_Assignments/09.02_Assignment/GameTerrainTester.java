/**
 * This Class tests all different types of terrain
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/10/2021
 */
public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain basicTerrain = new Terrain(100, 100);
        Mountain basicMountain = new Mountain(500, 1000, 7);
        WinterMountain winterMountain = new WinterMountain(500, 750, 7, 15.64);
        Forest basicForest = new Forest(20, 50, 13);
        Water basicWater = new Water(40, 40, 30);
        River riverWater = new River(100, 10, 10, 5);

        System.out.println(basicTerrain.getTerrainDesc() + "\n");
        System.out.println(basicForest.getForestDesc() + "\n");
        System.out.println(basicMountain.getMountainDesc() + "\n");
        System.out.println(winterMountain.getWinterMtnDesc() + "\n");
        System.out.println(basicWater.getWaterDesc() + "\n");
        System.out.println(riverWater.getRiverDesc() + "\n");

    }
}
