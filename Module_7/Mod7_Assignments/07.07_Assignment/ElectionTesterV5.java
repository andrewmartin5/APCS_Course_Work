/**
 * This class tests the candidate class by using arrays.
 *
 * @author Andrew Martin
 * @version 5.0
 * @since 3/15/2021
 */

public class ElectionTesterV5 {
    private static int allVotes = 0;

    public static void printCandidates(Candidate[] candidates) {
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

    public static void changeName(Candidate[] candidates, String oldName, String newName) {
        int missCounter = 0;
        for (Candidate c : candidates) {
            if (c.getName().equals(oldName)) {
                c.setName(newName);
                System.out.println("<< Changing " + oldName + " to " + newName + " >>");
            } else {
                missCounter++;
            }
        }
        if (missCounter == candidates.length) {
            System.out.println("Could not find your name");
        }
    }

    public static void changeVotes(Candidate[] candidates, String name, int newVotes) {
        int missCounter = 0;
        for (Candidate c : candidates) {
            if (c.getName().equals(name)) {
                c.setVotes(newVotes);
                System.out.println("<< Changing " + name + " votes to " + newVotes + " >>");
            } else {
                missCounter++;
            }
        }
        if (missCounter == candidates.length) {
            System.out.println("Could not find your name");
        }
    }

    public static void changeNameAndVotes(Candidate[] candidates, String oldName, String newName, int newVotes) {
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
        if (missCounter == candidates.length) {
            System.out.println("Could not find your name");
        }
    }

    public static void insertCandidate(Candidate[] candidates, int location, String name, int votes) {
        for (int i = candidates.length - 1; i > location; i--) {
            candidates[i] = candidates[i - 1];
        }
        candidates[location] = new Candidate(name, votes);
    }

    public static void insertCandidateBefore(Candidate[] candidates, String insertAfter, String name, int votes) {
        int location = 0;
        while (location < candidates.length && !candidates[location].getName().equals(insertAfter)) {
            location++;
        }
        for (int index = candidates.length - 1; index > location; index--) {
            candidates[index] = candidates[index - 1];
        }
        candidates[location] = new Candidate(name, votes);
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
        System.out.println("\nThe total number of votes is: " + allVotes + "\n");
    }

    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[] { new Candidate("Curt Schilling", 285),
                new Candidate("Barry Bonds", 248), new Candidate("Roger Clemens", 247),
                new Candidate("Scott Rolen", 212), new Candidate("Omar Vizquel", 197) };

        calcTotalVotes(candidates);
        printCandidates(candidates);
        changeName(candidates, "Omar Vizquel", "Billy Wagner");
        printTable(candidates);
        changeVotes(candidates, "Barry Bonds", 263);
        printTable(candidates);
        changeNameAndVotes(candidates, "Billy Wagner", "Gary Sheffield", 163);
        printTable(candidates);
        insertCandidate(candidates, 2, "David Wright", 248);
        printTable(candidates);
        insertCandidateBefore(candidates, "David Wright", "Manny Ramirez", 250);
        printTable(candidates);
    }
}
