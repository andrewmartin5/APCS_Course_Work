
/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        double counter = 9999;
        double theTerminator = 1000000000;          //initialize the terminating value

        while(counter < theTerminator)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            counter += 0.00000000000000000001;
        }//end of while loop

    }//end of main method
}//end of class
