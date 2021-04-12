import java.util.ArrayList;

/**
 * This class tests the shapes box, rectangle, and cube.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/11/2021
 */
public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Rectangle4> rectangularThings = new ArrayList<Rectangle4>();
        rectangularThings.add(new Rectangle4(10, 15));
        rectangularThings.add(new Square4(7));
        rectangularThings.add(new Parallelogram4(10, 15, 30));
        rectangularThings.add(new Box4(8, 8, 8));
        rectangularThings.add(new Cube4(8));

        for (Rectangle4 r : rectangularThings) {
            System.out.println(r);
        }

        System.out.println("\nTest for equality:\n");
        rectangularThings.get(0).equals(rectangularThings.get(1));
        System.out.println();
        rectangularThings.get(3).equals(rectangularThings.get(4));
    }
}
