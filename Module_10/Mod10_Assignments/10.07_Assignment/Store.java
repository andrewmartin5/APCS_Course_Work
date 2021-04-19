/**
 * This class tests the Item.java, as well as allows for sorting of item arrays.
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 4/19/2021
 */

public class Store {
    public static void sortByName(Item[] store, boolean isAscending) {
        System.out.println("Sorting by name. Ascending: " + isAscending + "\n");
        Item[] temp = new Item[store.length];
        int insertLocation;
        for (int i = 0; i < store.length; i++) {
            insertLocation = 0;
            for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                if (isAscending && store[i].getName().compareTo(temp[movieBeingSorted - 1].getName()) > 0) {
                    insertLocation = movieBeingSorted;
                } else if (!isAscending && store[i].getName().compareTo(temp[movieBeingSorted - 1].getName()) < 0) {
                    insertLocation = movieBeingSorted;
                } else {
                    temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                }
            }
            temp[insertLocation] = store[i];
        }
        for (int i = 0; i < store.length; i++) {
            store[i] = temp[i];
        }
    }

    public static void sortByNum(Item[] store, boolean isAscending) {
        int location;
        int testPos;
        Item temp;

        System.out.println("Sorting by product number. Ascending: " + isAscending + "\n");
        for (int i = store.length - 1; i >= 0; i--) {
            location = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (isAscending && store[testPos].getNum() > store[location].getNum()) {
                    location = testPos;
                }
                if (!isAscending && store[testPos].getNum() < store[location].getNum()) {
                    location = testPos;
                }
            }
            temp = store[i];
            store[i] = store[location];
            store[location] = temp;
        }
    }

    public static void sortByPrice(Item[] store, boolean isAscending) {
        int location;
        int testPos;
        Item temp;
        System.out.println("Sorting by price. Ascending: " + isAscending + "\n");
        for (int i = store.length - 1; i >= 0; i--) {
            location = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (isAscending && store[testPos].getPrice() > store[location].getPrice()) {
                    location = testPos;
                }
                if (!isAscending && store[testPos].getPrice() < store[location].getPrice()) {
                    location = testPos;
                }
            }
            temp = store[i];
            store[i] = store[location];
            store[location] = temp;
        }
    }

    public static void sortByQuantity(Item[] store) {
        System.out.println("Sorting by quantity\n");
        mergeSort(store, 0, store.length - 1);
    }

    public static void mergeSort(Item[] store, int low, int high) {

        if (low == high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(store, low, mid);
        mergeSort(store, mid + 1, high);
        merge(store, low, mid, high);
    }

    public static void merge(Item[] store, int low, int mid, int high) {
        Item[] temp = new Item[high - low + 1];

        int loc = 0;
        for (int i = low, x = mid + 1; i <= mid || x <= high; loc++) {
            if (i > mid) {
                temp[loc] = store[x];
                x++;
            } else if (x > high) {
                temp[loc] = store[i];
                i++;
            } else if (store[i].getQuantity() < store[x].getQuantity()) {
                temp[loc] = store[i];
                i++;
            } else {
                temp[loc] = store[x];
                x++;
            }
        }
        for (int i = low; i <= high; i++) {
            store[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {
        Item[] store = new Item[10];
        store[0] = new Item("Sack of Potatoes", 0001, 1.99, 10);
        store[1] = new Item("Apple", 0002, 0.33, 25);
        store[2] = new Item("Bananna Bunch", 0003, 1.99, 15);
        store[3] = new Item("Box of Strawberries", 0004, 4.96, 10);
        store[4] = new Item("Watermelon", 0005, 6.99, 7);
        store[5] = new Item("Ryzen 5 5600x", 1029, 299.00, 3);
        store[6] = new Item("RTX 3070", 5849, 499.00, 0);
        store[7] = new Item("B550 Motherboard", 2837, 139.99, 30);
        store[8] = new Item("Crucial 1 TB SSD", 4830, 104.09, 12);
        store[9] = new Item("32 Gb RAM", 3829, 187.49, 7);

        System.out.println(Item.toString(store));
        sortByName(store, true);
        System.out.println(Item.toString(store));
        sortByName(store, false);
        System.out.println(Item.toString(store));
        sortByNum(store, true);
        System.out.println(Item.toString(store));
        sortByNum(store, false);
        System.out.println(Item.toString(store));
        sortByPrice(store, true);
        System.out.println(Item.toString(store));
        sortByPrice(store, false);
        System.out.println(Item.toString(store));
        sortByQuantity(store);
        System.out.println(Item.toString(store));
    }
}
