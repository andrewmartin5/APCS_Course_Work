/**
 * This class defines a method of calculating a fibonacci number when given a
 * number in the sequence
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/16/2021
 */
public class FibonacciCalculator {
    public static int calcFibonacci(int x) {
        if (x <= 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return calcFibonacci(x - 1) + calcFibonacci(x - 2); // recursive call
        }
    }
}
