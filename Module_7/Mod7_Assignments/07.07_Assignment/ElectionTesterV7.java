/**
 * This class tests the candidate class by using arrays.
 *
 * @author Andrew Martin
 * @version 7.0
 * @since 3/17/2021
 */

public class ElectionTesterV7 {
    private static int allVotes = 0;

    public static void printCandidates(Candidate[] candidates) {
        System.out.println("\n Raw Election Data: \n");
        for (int i = 0; i < candidates.length && candidates[i] != null; i++) {
            System.out.println(candidates[i].toString());
        }
        System.out.println("\nThe total number of votes is: " + allVotes);
    }

    public static void printTable(Candidate[] candidates) {
        calcTotalVotes(candidates);
        System.out.println("\nElection Results:\n");
        System.out.println("                  Votes         % of Total");
        System.out.println("Candidate        Recieved          Votes  ");
        System.out.println("==========================================");
        for (int i = 0; i < candidates.length && candidates[i] != null; i++) {
            System.out.printf("%-15s%8d %17.2f%n", candidates[i].getName(), candidates[i].getVotes(),
                    ((double) candidates[i].getVotes() / allVotes * 100.0));
        }
        System.out.println("\nThe total number of votes is: " + allVotes + "\n");
    }

    public static void calcTotalVotes(Candidate[] candidates) {
        allVotes = 0;
        for (int i = 0; i < candidates.length && candidates[i] != null; i++) {
            allVotes += candidates[i].getVotes();
        }
    }

    public int getTotalVotes(Candidate[] candidates) {
        return allVotes;
    }

    public static void changeName(Candidate[] candidates, String oldName, String newName) {
        int missCounter = 0;
        for (int i = 0; i < candidates.length && candidates[i] != null; i++) {
            if (candidates[i].getName().equals(oldName)) {
                candidates[i].setName(newName);
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
        for (int i = 0; i < candidates.length && candidates[i] != null; i++) {
            if (candidates[i].getName().equals(name)) {
                candidates[i].setVotes(newVotes);
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
        for (int i = 0; i < candidates.length && candidates[i] != null; i++) {
            if (candidates[i].getName().equals(oldName)) {
                candidates[i].setName(newName);
                candidates[i].setVotes(newVotes);
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
        for (int i = candidates.length - 1; i > location && candidates[i] != null; i--) {
            candidates[i] = candidates[i - 1];
        }
        System.out.println("<< Adding " + name + " to the number " + (location + 1) + " spot >>");
        candidates[location] = new Candidate(name, votes);
    }

    public static void insertCandidateBefore(Candidate[] candidates, String insertAfter, String name, int votes) {
        int location = 0;
        while (location < candidates.length && candidates[location] != null
                && !candidates[location].getName().equals(insertAfter)) {
            location++;
        }
        for (int index = candidates.length - 1; index > location && candidates[index] != null; index--) {
            candidates[index] = candidates[index - 1];
        }
        System.out.println("<< Adding " + name + " before " + insertAfter);
        candidates[location] = new Candidate(name, votes);
    }

    public static void deleteCandidate(Candidate[] candidates, int location) {
        System.out.println("<< Deleting " + candidates[location].getName() + " >>");
        for (int i = location; i < candidates.length - 1 && candidates[i] != null; i++) {
            candidates[i] = candidates[i + 1];
        }
        candidates[candidates.length - 1] = null;
    }

    public static void deleteByName(Candidate[] candidates, String name) {
        System.out.println("<< Deleting " + name + " >>");
        int location = 0;
        while (location < candidates.length && candidates[location] != null
                && !candidates[location].getName().equals(name)) {
            location++;
        }
        for (int i = location; i < candidates.length - 1 && candidates[i] != null; i++) {
            candidates[i] = candidates[i + 1];
        }
        candidates[candidates.length - 1] = null;
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
        deleteCandidate(candidates, 3);
        printTable(candidates);
        deleteByName(candidates, "Roger Clemens");
        printTable(candidates);
    }
}
