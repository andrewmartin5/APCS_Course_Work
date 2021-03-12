
/**
 * This project creates an arraylist of virtual cheesecakes, calculates their ingredients and servings, and prints them in a neat table
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/11/2021
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1 {
    public static void main(String[] args) {
        // initializing and declaring an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1("Blueberry", 5));
        cake.add(new CheeseCakeV1("Strawberry", 6));
        cake.add(new CheeseCakeV1("Cherry", 4));
        cake.add(new CheeseCakeV1("Jalepeno", 1));
        cake.add(new CheeseCakeV1("Dill Pickle", 2));
        cake.add(new CheeseCakeV1("Fig", 3));

        // calls several method for each object to perform calculations
        for (CheeseCakeV1 dataRecord : cake) {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }

        // printing the format of the table
        System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        // using a for loop to print out the objects' data
        for (int index = 0; index < cake.size(); index++) {
            System.out.println(cake.get(index).toString(index));
        }
    }
}
