
/**
 * This class defines a Rectangle object using length and width. The toString
 * method has been added.
 *
 *
 * @author Andrew Martin
 * @version 4.0
 * @since 4/11/2021
 */
public class Rectangle4 {
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength() {
        return length;
    }

    // return the width
    public int getWidth() {
        return width;
    }

    // String to display when object is printed.

    public String toString() {
        return "Rectangle - " + length + " X " + width;
    }

    public boolean equals(Object rect) {
        if (((Rectangle4) rect).getLength() == getLength() && ((Rectangle4) rect).getWidth() == getWidth()) {
            System.out.println(toString() + " IS same size as " + rect.toString());
            return true;
        }
        System.out.println(toString() + " is NOT same size as " + rect.toString());
        return false;
    }
}
