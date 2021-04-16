
/**
 * This class tests the recursive method for the given Piecewise function.
 *
 * @author Elle Navan
 * @version 06/12/17
 */
class RecursiveMethods {
    RecursiveMethods() // default constructor
    {
    }

    public int fOf(int x) {
        if (x <= 17) // the base case
        {
            System.out.println(x + " <= 10, therefore ... f(" + x + ") = -5");
            return -10;
        } else {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 3) + 2 = f(" + (x - 3) + ") + 2");
            return fOf(x - 12) + 2; // recursive call
        }
    }
}

public class RecursionMethodTester {
    public static void main(String[] args) {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();

        System.out.println("---------------------------------");
        System.out.println("       f(x - 3) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -5              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();

        // Call fOf with an x value of 20
        x = 35;
        System.out.println("Example 1:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
    }
}
