public class Parallelogram4 extends Rectangle4 {
    private int offset;

    public Parallelogram4(int l, int w, int angleOffset) {
        super(l, w);
        offset = angleOffset;
    }

    public int getAngleOffset() {
        return offset;
    }

    public String toString() {
        return "Parallelogram -  " + getLength() + " X " + getWidth() + " with an offset of " + getAngleOffset()
                + " degrees";
    }
}