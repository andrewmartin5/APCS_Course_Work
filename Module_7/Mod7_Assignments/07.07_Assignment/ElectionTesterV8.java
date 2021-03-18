import java.util.ArrayList;

/**
 * This class tests the candidate class by using arraylists.
 *
 * @author Andrew Martin
 * @version 8.0
 * @since 3/17/2021
 */

public class ElectionTesterV8 {
    private static int allVotes = 0;

    public static void printCandidates(ArrayList<Candidate> candidates) {
        calcTotalVotes(candidates);
        System.out.println(" Raw Election Data: \n");
        for (int i = 0; i < candidates.size() && candidates.get(i) != null; i++) {
            System.out.println(candidates.get(i).toString());
        }
        System.out.println("\nThe total number of votes is: " + allVotes);
    }

    public static void printTable(ArrayList<Candidate> candidates) {
        calcTotalVotes(candidates);
        System.out.println("Election Results:\n");
        System.out.println("                  Votes         % of Total");
        System.out.println("Candidate        Recieved          Votes  ");
        System.out.println("==========================================");
        for (int i = 0; i < candidates.size() && candidates.get(i) != null; i++) {
            System.out.printf("%-15s%8d %17.2f%n", candidates.get(i).getName(), candidates.get(i).getVotes(),
                    ((double) candidates.get(i).getVotes() / allVotes * 100.0));
        }
        System.out.println("\nThe total number of votes is: " + allVotes);
    }

    public static void calcTotalVotes(ArrayList<Candidate> candidates) {
        allVotes = 0;
        for (int i = 0; i < candidates.size() && candidates.get(i) != null; i++) {
            allVotes += candidates.get(i).getVotes();
        }
    }

    public int getTotalVotes(ArrayList<Candidate> candidates) {
        return allVotes;
    }

    public static void changeName(ArrayList<Candidate> candidates, String oldName, String newName) {
        int missCounter = 0;
        for (int i = 0; i < candidates.size() && candidates.get(i) != null; i++) {
            if (candidates.get(i).getName().equals(oldName)) {
                candidates.get(i).setName(newName);
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
        for (int i = 0; i < candidates.size() && candidates.get(i) != null; i++) {
            if (candidates.get(i).getName().equals(name)) {
                candidates.get(i).setVotes(newVotes);
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
        for (int i = 0; i < candidates.size() && candidates.get(i) != null; i++) {
            if (candidates.get(i).getName().equals(oldName)) {
                candidates.get(i).setName(newName);
                candidates.get(i).setVotes(newVotes);
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

    public static void insertCandidate(ArrayList<Candidate> candidates, int location, String name, int votes) {
        for (int i = candidates.size() - 1; i > location && candidates.get(i) != null; i--) {
            candidates.set(i, candidates.get(i - 1));
        }
        System.out.println("<< Adding " + name + " to the number " + (location + 1) + " spot >>");
        candidates.set(location, new Candidate(name, votes));
    }

    public static void insertCandidateBefore(ArrayList<Candidate> candidates, String insertAfter, String name,
            int votes) {
        int location = 0;
        while (location < candidates.size() && candidates.get(location) != null
                && !candidates.get(location).getName().equals(insertAfter)) {
            location++;
        }
        for (int index = candidates.size() - 1; index > location && candidates.get(index) != null; index--) {
            candidates.set(index, candidates.get(index - 1));
        }
        System.out.println("<< Adding " + name + " before " + insertAfter);
        candidates.set(location, new Candidate(name, votes));
    }

    public static void deleteCandidate(ArrayList<Candidate> candidates, int location) {
        for (int i = location; i < candidates.size() - 1 && candidates.get(i) != null; i++) {
            candidates.set(i, candidates.get(i + 1));
        }
        System.out.println("<< Deleting " + candidates.get(location).getName() + " >>");
        candidates.set(candidates.size() - 1, null);
    }

    public static void deleteByName(ArrayList<Candidate> candidates, String name) {
        int location = 0;
        System.out.println("<< Deleting " + name + " >>");
        while (location < candidates.size() && candidates.get(location) != null
                && !candidates.get(location).getName().equals(name)) {
            location++;
        }
        for (int i = location; i < candidates.size() - 1 && candidates.get(i) != null; i++) {
            candidates.set(i, candidates.get(i + 1));
        }
        candidates.set((candidates.size() - 1), null);
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
