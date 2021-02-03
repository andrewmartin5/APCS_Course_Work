/**
 * This program creates a guitar object with a name and tuning. It can then
 * change the tuning of the guitar and play a note in C major
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 2/2/2021
 */

public class GuitarV3 {
    // default constructor
    public GuitarV3() {

    }

    // Changes the guitar's tuning and prints out the new tuning
    public String changeTuning(String newTuning) {
        String tuning = newTuning;
        System.out.println("The guitar has been retuned to " + tuning + ".");
        return tuning;
    }

    // Determines if a note is in the key of C, and if it is prints it to terminal,
    // along with the guitar name and the tuning.
    public void playNote(String name, String note, String tuning) {
        if (!("A".equals(note) || "B".equals(note) || "C".equals(note) || "D".equals(note) || "E".equals(note)
                || "F".equals(note) || "G".equals(note))) {
            System.out.println("Sorry, your note is not in the key of C or does not exist.");
        } else {
            System.out.println("The " + name + " plays a " + note + ". \t Tuning: " + tuning);
        }
    }

    public static void main(String[] args) {
        // Defines the name and tuning of the guitar (tuning starts two frets lower than
        // standard)
        String name = "Stratocaster";
        String tuning = "DGCFAD";

        // Defines strat as a new GuitarV3 object
        GuitarV3 strat = new GuitarV3();

        // Changes the tuning of the strat to standard tuning
        tuning = strat.changeTuning("EADGBE");
        // Plays a note and displays the guitar name and tuning
        strat.playNote(name, "C", tuning);

    }

}
