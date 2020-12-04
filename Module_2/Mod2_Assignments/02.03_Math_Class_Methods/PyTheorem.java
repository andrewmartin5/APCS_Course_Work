/**
 * This program calculates the hypotenuse of two right triangles after creating values for their
 * two sides in the range (5, 23].
 *
 * @Andrew Martin
 * @12/3/2020
 */
public class PyTheorem
{
    public static void main(String [ ] args)
    {
        //initialize variables
        int triangleNum = 0;    //this is the number of triangles calculated
        int sideOne = 5 + (int)(Math.random() * (23 - 5));    //creates random integer in the range (5, 23]
        int sideTwo = 5 + (int)(Math.random() * (23 - 5));    //creates random integer in the range (5, 23]
        double hypotenuse = Math.hypot((double)sideOne, (double)sideTwo);   //calculates hypotenuse using Math.hypot
        triangleNum ++; //incriments the triangle
        
        System.out.println("Triangle " + triangleNum + "\tSide 1: " + sideOne + 
            "\tSide 2: " + sideTwo + "\tHypotenuse: " + hypotenuse);    //prints triangle number, side, and hypotenuse values
            
        triangleNum ++; //incriments the triangle
        sideOne = 5 + (int)(Math.random() * (23 - 5));    //updates random number
        sideTwo = 5 + (int)(Math.random() * (23 - 5));    //updates random number
        hypotenuse = Math.hypot((double)sideOne, (double)sideTwo);  //recalculates hypotenuse w/ new values
        
        System.out.println("Triangle " + triangleNum + "\tSide 1: " + sideOne + 
            "\tSide 2: " + sideTwo + "\tHypotenuse: " + hypotenuse);    //prints triangle number, side, and hypotenuse values
    } // end of main  method
} // end of class
