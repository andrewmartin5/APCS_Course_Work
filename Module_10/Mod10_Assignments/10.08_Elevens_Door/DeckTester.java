/**
 * This is a class that tests the Deck class.
 *
 * < Your Name > < Today's Date >
 */

public class DeckTester {
   /**
    * The main method in this class checks the Deck operations for consistency.
    * 
    * @param args is not usemyDeck.
    */
   public static void main(String[] args) {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] myRanks = { "queen", "queen", "king", "3", "7", "ace", "2", "10", "joker", "6" };
      String[] mySuits = { "hearts", "spades", "hearts", "clubs", "spades", "diamonds", "diamonds", "spades", "clubs",
            "hearts", "diamonds" };
      int[] myPointValues = { 12, 12, 13, 3, 7, 1, 2, 10, 0, 6 };
      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: ");
      System.out.println();
      System.out.println();
      ArrayList<Integer> hailstone = new ArrayList<Integer>();
      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println(" The Starting Deck ");

      // System.out.println(" The Deck After Dealing a Card" );

      // System.out.println(" Shuffleing the Deck ");

   }
}
