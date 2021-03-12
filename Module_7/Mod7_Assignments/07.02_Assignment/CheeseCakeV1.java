/**
 * This class is used to create cheesecakes and calculate their servings and
 * ingredients
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/11/2021
 */
public class CheeseCakeV1 {
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;

    /**
     * Constructor for objects of type CheeseCakeV1
     * 
     * @param flavor
     * @param quantity
     */
    CheeseCakeV1(String flavor, int quantity) {
        myFlavor = flavor;
        myQuantity = quantity;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings() {
        myServings = myQuantity * 16;
    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese() {
        myCreamCheese = myQuantity * 32;
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla() {
        myVanilla = myQuantity;
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar() {
        mySugar = myQuantity / 3.0;
    }

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getquantity() {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor() {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar() {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese() {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla() {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings() {
        return myServings;
    }

    public String toString(int index) {
        return String.format(" |%4s   |%6d    | %-14s|%7d oz    |%7d   |%5.2f  cups|%3d tsps   |", index, myQuantity,
                myFlavor, myCreamCheese, myServings, mySugar, myVanilla);
    }
}
