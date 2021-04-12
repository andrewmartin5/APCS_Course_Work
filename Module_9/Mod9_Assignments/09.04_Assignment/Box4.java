/**
 * This class defines a Box object by extending Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Andrew Martin
 * @version 4.0
 * @since 4/11/2021
 */
public class Box4 extends Rectangle4 {
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h) {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight() {
        return height;
    }

    // String to display when object is printed.

    public String toString() {
        return "Box - " + getLength() + " X " + getWidth() + " X " + height;
    }

    public boolean equals(Object box) {
        if (((Box4) box).getLength() == getLength() && ((Box4) box).getWidth() == getWidth()
                && ((Box4) box).getHeight() == getHeight()) {
            System.out.println(toString() + " IS same size as " + box.toString());
            return true;
        }
        System.out.println(toString() + " is NOT same size as " + box.toString());
        return false;
    }

}
