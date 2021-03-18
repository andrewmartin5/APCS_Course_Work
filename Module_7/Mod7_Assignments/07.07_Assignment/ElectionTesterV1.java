/**
 * This class tests the candidate class by using arrays.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/15/2021
 */

public class ElectionTesterV1 {
    private static int allVotes = 0;

    public static void printCandidates(Candidate[] candidates) {
        calcTotalVotes(candidates);
        System.out.println(" Raw Election Data: \n");
        for (Candidate c : candidates) {
            System.out.println(c.toString());
        }
        System.out.println("\nThe total number of votes is: " + allVotes);
    }

    public static void calcTotalVotes(Candidate[] candidates) {
        allVotes = 0;
        for (Candidate c : candidates) {
            allVotes += c.getVotes();
        }
    }

    public int getTotalVotes(Candidate[] candidates) {
        return allVotes;
    }

    public static void printTable(Candidate[] candidates) {
        calcTotalVotes(candidates);
        System.out.println("Election Results:\n");
        System.out.println("                  Votes         % of Total");
        System.out.println("Candidate        Recieved          Votes  ");
        System.out.println("==========================================");
        for (Candidate c : candidates) {
            System.out.printf("%-15s%8d %17.2f%n", c.getName(), c.getVotes(),
                    ((double) c.getVotes() / allVotes * 100.0));
        }
        System.out.println("\nThe total number of votes is: " + allVotes);
    }

    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[] { new Candidate("Curt Schilling", 285),
                new Candidate("Barry Bonds", 248), new Candidate("Roger Clemens", 247),
                new Candidate("Scott Rolen", 212), new Candidate("Omar Vizquel", 197) };

        calcTotalVotes(candidates);
        printCandidates(candidates);
        printTable(candidates);
    }
}
