/**
 * This class creates items for a store that has names, a product number,
 * pricing, and a specific quantity. It also allows for the conversion of an
 * Item array to a string.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/19/2021
 */
public class Item {
    private String name;
    private int productNum, quantity;
    private double price;

    /**
     * Creates an Item object
     * 
     * @param n Name
     * @param p Product Number
     * @param c Cost
     * @param q Quantity
     */
    public Item(String n, int p, double c, int q) {
        name = n;
        productNum = p;
        price = c;
        quantity = q;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return productNum;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return String.format("%-15s%-10d%-5d%.2f", name, productNum, quantity, price);
    }

    public static String toString(Item[] store) {
        String table = "Name            Product Num  Quantity   Price\n";
        table += "=============================================\n";
        for (Item i : store) {
            table += String.format("%-20s%04d%10d%10.2f\n", i.name, i.productNum, i.quantity, i.price);
        }
        return table;
    }

}