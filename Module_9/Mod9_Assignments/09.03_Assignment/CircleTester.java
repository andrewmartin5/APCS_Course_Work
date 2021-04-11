import java.util.ArrayList;

/**
 * This Class tests the multiple circle classes, including circle, oval,
 * cylinder, and oval cylinder.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/11/21
 */
public class CircleTester {

    public static String showCenter(Circle2 roundThing) {
        return "For this " + roundThing.getName() + " the center is at " + roundThing.getCenter();
    }

    public static void main(String[] args) {
        ArrayList<Circle2> roundThings = new ArrayList<Circle2>();
        roundThings.add(new Circle2(3, 4, 5));
        roundThings.add(new Oval2(4, 0, 3, 2));
        roundThings.add(new Cylinder2(0, 0, 5, 10));
        roundThings.add(new OvalCylinder2(1, 1, 2, 3, 5));

        for (Circle2 roundThing : roundThings) {
            System.out.println(showCenter(roundThing));
        }
    }
}
