import java.util.ArrayList;

/**
 * This class tests the candidate class by using arraylists.
 *
 * @author Andrew Martin
 * @version 4.0
 * @since 3/15/2021
 */

public class ElectionTesterV4 {
    private static int allVotes = 0;

    public static void printCandidates(ArrayList<Candidate> candidates) {
        calcTotalVotes(candidates);
        System.out.println(" Raw Election Data: \n");
        for (Candidate c : candidates) {
            System.out.println(c.toString());
        }
        System.out.println("\nThe total number of votes is: " + allVotes);
    }

    public static void calcTotalVotes(ArrayList<Candidate> candidates) {
        allVotes = 0;
        for (Candidate c : candidates) {
            allVotes += c.getVotes();
        }
    }

    public static void changeName(ArrayList<Candidate> candidates, String oldName, String newName) {
        int missCounter = 0;
        for (Candidate c : candidates) {
            if (c.getName().equals(oldName)) {
                c.setName(newName);
                System.out.println("<< Changing " + oldName + " to " + newName + " >>");
            } else {
                missCounter++;
            }
        }
        if (missCounter == candidates.size()) {
            System.out.println("Could not find your name");
        }
    }

    public static void changeVotes(ArrayList<Candidate> candidates, String name, int newVotes) {
        int missCounter = 0;
        for (Candidate c : candidates) {
            if (c.getName().equals(name)) {
                c.setVotes(newVotes);
                System.out.println("<< Changing " + name + " votes to " + newVotes + " >>");
            } else {
                missCounter++;
            }
        }
        if (missCounter == candidates.size()) {
            System.out.println("Could not find your name");
        }
    }

    public static void changeNameAndVotes(ArrayList<Candidate> candidates, String oldName, String newName,
            int newVotes) {
        int missCounter = 0;
        for (Candidate c : candidates) {
            if (c.getName().equals(oldName)) {
                c.setName(newName);
                c.setVotes(newVotes);
                System.out.println(
                        "<< Changing " + oldName + " name to " + newName + " and votes to " + newVotes + " >>");
            } else {
                missCounter++;
            }
        }
        if (missCounter == candidates.size()) {
            System.out.println("Could not find your name");
        }
    }

    public int getTotalVotes(ArrayList<Candidate> candidates) {
        return allVotes;
    }

    public static void printTable(ArrayList<Candidate> candidates) {
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
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Curt Schilling", 285));
        candidates.add(new Candidate("Barry Bonds", 248));
        candidates.add(new Candidate("Roger Clemens", 247));
        candidates.add(new Candidate("Scott Rolen", 212));
        candidates.add(new Candidate("Omar Vizquel", 197));

        calcTotalVotes(candidates);
        printCandidates(candidates);
        changeName(candidates, "Omar Vizquel", "Billy Wagner");
        printTable(candidates);
        changeVotes(candidates, "Barry Bonds", 263);
        printTable(candidates);
        changeNameAndVotes(candidates, "Billy Wagner", "Gary Sheffield", 163);
        printTable(candidates);
    }
}
