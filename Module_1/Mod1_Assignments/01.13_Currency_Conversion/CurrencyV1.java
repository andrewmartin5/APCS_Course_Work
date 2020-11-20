/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Andrew Martin
 * @version 11/20/2020
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars
        //Initialize variables for Pesos
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //Initialize variables for Yen
        double yenSpent = 99939.75;             // Japanese Yen Spent
        //TODO update Echange rates
        double yenExchangeRate = 15.42;         // 1 US dollar = TODO Yen
        double dollarsSpentInJapan = 0.0;       // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;         // US dollars remaining after Japan
        //Initialize variables for Euros
        double eurosSpent = 624.95;             // Euros spent
        //TODO update Echange rates
        double euroExchangeRate = 583.34;       // 1 US dollar = TODO Euros
        double dollarsSpentInFrance = 0.0;      // US dollars spent in France
        double dollarsAfterFrance = 0.0;        // US dollars remaining after France
        //Initialize variables for suvenirs
        int costItem1 = 12;                     // cost per item of first souvenir
        int budget1 = 100;                      // budget for first item
        int totalItems1 = 0;                    // how many items can be purchased
        int fundsRemaining1 = 0;                // how much of the budget is left
        double costItem2 = 29.99;               // cost per item of second souvenir
        int budget2 = 500;                      // budget for second item
        int totalItems2 = 0;                    // how many items can be purchased
        double fundsRemaining2 = 0.0;           // how much of the budget is left        
        
        //All Calculations that can be done with current information are done here
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;           // calculate US dollars spent in Mexico
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;  // calculate US dollars remaining after Mexico
        dollarsSpentInJapan = yenSpent / yenExchangeRate;               // calculate US dollars spent in Japan
        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;   // calculate US dollars remaining after Japan
        dollarsSpentInFrance = eurosSpent / euroExchangeRate;           // calculate US dollars spent in France
        dollarsAfterFrance = dollarsAfterJapan - dollarsSpentInFrance;  // calculate US dollars remaining after France
        totalItems1 = budget1 / costItem1;          // calculate total items purchasable within budget
        fundsRemaining1 = budget1 % costItem1;      // calculate remaining budget after buying the maximum numbers of items
        totalItems2 = (int)(budget2 / costItem2);   // calculate total items purchasable within budget
        fundsRemaining2 = budget2 % costItem2;      // calculate remaining budget after buying the maximum numbers of items
        
        //Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        //Prints out the Money before and after visiting a country, as well as the dollars spent within the country
        System.out.println("Starting US dollars:\t\t" + startingUsDollars + "\n");
        System.out.println("Mexico:");
        System.out.println(" Pesos spent:\t\t\t" + pesosSpent);
        System.out.println(" US dollars equivalent:\t\t" + dollarsSpentInMexico);
        System.out.println(" US dollars remaining:\t\t" + dollarsAfterMexico);

        System.out.println("Japan:");
        System.out.println(" Yen spent:\t\t\t" + yenSpent);
        System.out.println(" US dollars equivalent:\t\t" + dollarsSpentInJapan);
        System.out.println(" US dollars remaining:\t\t" + dollarsAfterJapan);

        System.out.println("France:");
        System.out.println(" Euros spent:\t\t\t" + eurosSpent);
        System.out.println(" US dollars equivalent:\t\t" + dollarsSpentInFrance);
        System.out.println(" US dollars remaining:\t\t" + dollarsAfterFrance);
        System.out.println("==================================================");
        System.out.println("Remaining US dollars:\t\t" + dollarsAfterFrance + "\n\n");

        //Header for souvenir section
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Prints out informaion for souvenir #1
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Prints out information for souvenir #2
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

