
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals using integer and double variables
 * 
 * The GradesV2 class prints out a table that displays the test number,
 * test grade, total points, and the average test grade. The goal is to use
 * shortcuts such as ++ or += to make the math more efficient.
 *  
 * @ author Andrew Martin
 * @ version 11/14/2020
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;            //counts number of tests
        int testGrade = 0;           //individual test grade for most recent test
        int totalPoints = 0;         //total point value of most recent test
        int summativeTestGrade = 0;  //individual test grade for all tests
        double average = 0.0;        //average grade
        
        numTests ++;
        testGrade = 95;
        totalPoints = 95;
        summativeTestGrade += testGrade;
        average = (summativeTestGrade/numTests);
        System.out.println("Test # " + numTests + "\tTest Grade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage Score: " + average);
        
        numTests ++;
        testGrade = 73;
        totalPoints = 168;
        summativeTestGrade += testGrade;
        average = (summativeTestGrade/numTests);
        System.out.println("Test # " + numTests + "\tTest Grade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage Score: " + average);
        
        numTests ++;
        testGrade = 91;
        totalPoints = 259;
        summativeTestGrade += testGrade;
        average = ((double)summativeTestGrade/numTests);
        System.out.println("Test # " + numTests + "\tTest Grade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage Score: " + average);
        
        numTests ++;
        testGrade = 82;
        totalPoints = 341;
        summativeTestGrade += testGrade;
        average = ((double)summativeTestGrade/numTests);
        System.out.println("Test # " + numTests + "\tTest Grade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage Score: " + average);
    } // end of main method
} // end of class
