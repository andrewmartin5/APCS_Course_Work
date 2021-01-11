/**
 * This program reads a file and determines the likelihood of different Male-Female outcomes in a family with two children
 *
 * @author Andrew Martin
 * @version 1/11/2021
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        int famCount = 0;
        int BBCount = 0;
        int GGCount = 0;
        int mixdCount = 0;
        String token = "";
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);

        // While loop will continue as long as there is still more to read
        while(inFile.hasNext())
        {
            // Sets next input from file to token
            token = inFile.next();
            
            // Determines if the token is a male male, female, female,or mixed pair of children
            if (token.equals("BB")) {
                BBCount ++;
                famCount ++;
            }
            else if (token.equals("GG")) {
                GGCount ++;
                famCount ++;
            }
            else if (token.equals("BG") || token.equals("GB")) {
                mixdCount ++;
                famCount ++;
            }
        }// End while

        inFile.close();                 // Close input file
        
        // Determines 100 times the percent (this allows for rounding in the future)
        double BBPercentDouble = 10000.0 * ((double)BBCount /(double)famCount);
        double GGPercentDouble = 10000.0 * ((double)GGCount /(double)famCount);
        double mixdPercentDouble = 10000.0 * ((double)mixdCount /(double)famCount);
        
        // Rounds the percent to the nearest hundreth
        double BBPercent = (int)BBPercentDouble / 100.0;
        double GGPercent = (int)GGPercentDouble / 100.0;
        double mixdPercent = (int)mixdPercentDouble / 100.0;
        
        // Prints output
        System.out.print("Composition statistics for families with two children.\n\nTotal number of families: " + famCount);

        System.out.println("\nNumber of families with\n\t\t2 boys: " + BBCount + " represents " + BBPercent + "%");
        System.out.println("\t\t2 girls: " + GGCount + " represents " + GGPercent + "%");
        System.out.println("1 boy and 1 girl: " + mixdCount + " represents " + mixdPercent + "%");
    }// End of main method
}// End of class