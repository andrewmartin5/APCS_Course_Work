
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author APCS Team
 * @ version 2020
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iAddend1 = 25;
        int iAddend2 = 9;
        int iSubtraction1 = 11;
        int iSubtraction2 = 9;
        int iSubtraction3 = 25;
        int iFactor1 = 25;
        int iFactor2 = 9;
        int iDivision1 = 9;
        int iDivision2 = 25;
        int iModulus1 = 11;
        int iModulus2  = 9;
        // Declare double variables
        double dAddend1 =43.21;
        double dAddend2 = 3.14;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iAddend1 + " + " + iAddend2 + " = " + (iAddend1 + iAddend2));
        System.out.println(dAddend1 + " + " + dAddend2 + " = " + (dAddend1 + dAddend2)+"\n");
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iSubtraction1 + " - " + iSubtraction2 + " - " + iSubtraction3 + " = "  + (iSubtraction1-iSubtraction2-iSubtraction3));
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0)+"\n");
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iFactor1 + " * " + iFactor2 + " = " + (iFactor1 * iFactor2)); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0)+"\n");
        
        // Division
        System.out.println("Division");
        System.out.println( iDivision1 + " / " + iDivision2 + " = " + (iDivision1 / iDivision2));
        System.out.println( "43.21 / 10.0 = " + (43.21 / 10.0)+"\n");
        
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iModulus1 + " % " + iModulus2 + " = " + (iModulus1 % iModulus2));
        System.out.println( "10.0 % 3.14  = " + (10.0 % 3.14));
    } // end of main method
} // end of class
