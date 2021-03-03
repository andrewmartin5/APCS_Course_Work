/**
 * This program creates a guitar object with a name and tuning. It can then
 * change the tuning of the guitar and play a note in C major
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 2/2/2021
 */

public class GuitarV8 {
    private String guitarName;
    private String guitarTuning;

    // One parameter constructor; tuning automatically reverts to standard
    public GuitarV8(String name) {
        guitarName = name;
        guitarTuning = "EADGBE";
    }

    // Two parameter constructor
    public GuitarV8(String name, String tuning) {
        guitarName = name;
        guitarTuning = tuning;
    }

    public String getName() {
        return guitarName;
    }

    public String getTuning() {
        return guitarTuning;
    }

    // Changes the guitar's name and prints out the new name
    public void setName(String newName) {
        System.out.println("The " + guitarName + " has been renamed to " + newName + ".");
        guitarName = newName;
    }

    // Changes the guitar's tuning and prints out the new tuning
    public void setTuning(String newTuning) {
        guitarTuning = newTuning;
        System.out.println("The" + guitarName + " has been retuned to " + guitarTuning + ".");
    }

    // Prints out all information about the guitar
    public void printGuitar() {
        System.out.println("Guitar Name: " + guitarName + "\nTuning: " + guitarTuning);
    }

    /**
     * Determines if a note is in the key of C, and if it is prints it to terminal,
     * along with the guitar name and the tuning.
     */
    public void playNote(String note) {
        if (!("A".equals(note) || "B".equals(note) || "C".equals(note) || "D".equals(note) || "E".equals(note)
                || "F".equals(note) || "G".equals(note))) {
            System.out.println("Sorry, your note is not in the key of C or does not exist.");
        } else {
            System.out.println(guitarName + " plays a " + note + ". \t Tuning: " + guitarTuning);
        }
    }
}
