/**
 * This program simulates an online candy shop, with the ability to take input from the shopper
 * and create an output recipt that reflects thee user's input.
 *
 * @Andrew Martin
 * @12/8/2020
 */ 
import java.util.Scanner;

public class OnlineCandyShop

{
    public static void main(String[] args)
    {
        //creates scanner object called input
        Scanner input;
        input = new Scanner(System.in);
        
        //prints header
        System.out.println("===================================================\n\n---------Welcome to the Virtual Candy Shop!--------\n\n===================================================\n");
        
        //requests and saves first and last name
        System.out.print("Hello and Welcome to the Virtual Candy Shop! Please\nenter your first and last name: ");
        String firstName = input.next();
        String lastName = input.next();
        
        //requests and saves date, also splits date into month, day, and year substrings for use in the recipt
        System.out.print("\nPlease Enter Today's Date (mm/dd/yyyy): ");
        String fullDate = input.next();
        String month = fullDate.substring(0,2);
        String day = fullDate.substring(3,5);
        String year = fullDate.substring(6);
        
        //Requests candy for purchase,as well as lists stock and stores candy once type is inputted.
        System.out.println("\nWhat candy would you like to purchase?\n\t~Candy~\t\t~Price~\n\n\tSmall Candy\t$0.05\n\n\tMedium Candy\t$0.25\n\n\tLarge Candy\t$0.50\nCandy Type: ");
        String candyType = input.next();
        input.nextLine();
        
        //Uses if statements to set price of candy to match its candy type
        Double candyPrice = 0.0;
        if (candyType.equals("Small") || candyType.equals("small")) {
            candyPrice = 0.50;  //price for a small candy
        }
        else if (candyType.equals("Medium") || candyType.equals("medium")) {
            candyPrice = 1.00;  //price for a medium candy
        }
        else if (candyType.equals("Large") || candyType.equals("large")) {
            candyPrice = 2.00;  //price for a large candy
        }
        else {
            System.out.println("\nSorry, what you entered did not match our inventory, please come back later.");
            System.exit(0); //if a candy that isn't listed comes up, the program will stop
        }
        
        //requests and stores how many candies are to be bought
        System.out.println("\nHow many " + candyType + " candies would you like?");
        String amount = input.next();
        
        //calculates final price and asks user to confirm
        Double finalPrice =  candyPrice * Double.parseDouble(amount);
        System.out.println("\nYour final price is $" + finalPrice + ". Is that alright (y/n)?");
        String confirmation = String.valueOf(input.next().charAt(0));   //this line takes the input, finds the first character, and returns it as a string
        if (!(confirmation.equals("Y") || confirmation.equals("y"))) {
            System.out.println("\nYou have denied your order confirmation. Please come back later!");
            System.exit(0); //if the user does not confirm their order, then the program will stop
        }
        
        //requests and stores user's card number
        System.out.println("\nThank you for confirming your order. Before we can\nfinalize your order, please enter your debit card\nnumber (#####-###-####): ");
        String cardNumber = input.next();
        
        //requests and stores user's pin
        System.out.println("\nPlease Enter your PIN (####): ");
        String pin = input.next();
        
        //prints e-recipt
        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\nYour e-Receipt\n\n" + month + "-" + day + "-" + year + "\nOrder number: xq53ilx-03\n" + "\n  " + firstName.charAt(0) + ". " + lastName + "\n  Account: #####-###-" + cardNumber.substring(10) + "\n  Candy Type: " + candyType + " Candy" + "\n  Number of candies: " + amount + "\n\n  $" + finalPrice + " will be debited to your account.\n\n  Thank you and Have a great day!");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
    }//end of main method
}//end of class
