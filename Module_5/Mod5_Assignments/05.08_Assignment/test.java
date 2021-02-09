/**
 * The goal of this program is to test the GuitarV8 class
 * 
 * @author Andrew Martin
 * @version 1.0
 * @since 2/8/2021
 */

public class test {
    public static void main(String[] args) {
        // Defines strat as a new GuitarV3 object
        GuitarV8 strat = new GuitarV8("Stratocaster", "DGCFAD");
        GuitarV8 tele = new GuitarV8("Telecaster", "EADGB#E");

        // Prints out stratocaster Info
        strat.printGuitar();
        strat.printGuitar();

        // Renames stratocaster after Jimi Hendrix's guitar
        strat.setName("Izabella");
        // Renames telecaster after David Gilmour's guitar
        tele.setName("The Workmate");

        // Changes the tuning of the guitars to standard tuning
        strat.setTuning("EADGBE");
        tele.setTuning("EADGBE");

        // Plays a note and displays the guitar name and tuning
        strat.playNote("C");
        tele.playNote("C#");
    }
}
