/**
 * This is a class that tests the Card class.
 *
 * < Your Name > < Today's Date >
 */

public class CardTester {
   /**
    * The main method in this class checks the Card operations for consistency.
    * 
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card sixSpades = new Card("6", "spades", 6);
      Card threeHearts = new Card("3", "hearts", 3);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.getRank());
      System.out.println("  suit: " + aceHearts.getSuit());
      System.out.println("  pointValue: " + aceHearts.getPointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: six of spades ****");
      System.out.println("  rank: " + sixSpades.getRank());
      System.out.println("  suit: " + sixSpades.getSuit());
      System.out.println("  pointValue: " + sixSpades.getPointValue());
      System.out.println("  toString: " + sixSpades.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: three of hearts ****");
      System.out.println("  rank: " + threeHearts.getRank());
      System.out.println("  suit: " + threeHearts.getSuit());
      System.out.println("  pointValue: " + threeHearts.getPointValue());
      System.out.println("  toString: " + threeHearts.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** matches Tests ****");
      System.out.println(" matching: " + sixSpades.matches(sixSpades));
      System.out.println(" not matching: " + sixSpades.matches(threeHearts));
   }
}
