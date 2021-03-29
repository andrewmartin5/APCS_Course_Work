/**
 * Purpose: To create a music array and be able to search by title, year, and
 * artist.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/25/2021
 *
 */

public class MusicTesterV1 {
    static Music[] playlist = new Music[] { new Music("Better Now", 2018, "Post Malone"),
            new Music("Mr. Blue Sky", 1977, "Electric Light Orchestra"), new Music("Smooth", 1999, "Santana"),
            new Music("In the City", 1979, "Eagles"), new Music("Down Under", 1981, "Men At Work"),
            new Music("Baba O'Riley", 1971, "The Who"), new Music("Fell Invincible", 2016, "Skillet"),
            new Music("Alone", 2016, "Marshmello"), new Music("Pinball Wizard", 1969, "The Who") };

    public static void printPlaylist(Music[] playlist) {
        System.out.printf("%-25s %4s   %-20s%n", "Title", "Year", "Artist");
        System.out.println("=========================================================");
        for (Music song : playlist) {
            System.out.println(song.toString());
        }
        System.out.println();
    }

    public static void titleSearch(Music[] playlist, String title) {
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Search results for " + title + ":");
                System.out.println(playlist[i].toString());
                System.out.println();
                return;
            }
        }
        System.out.println(title + " is not on your playlist.\n");
    }

    public static void yearSearch(Music[] playlist, int year) {
        int numFound = 0;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].getYear() == year) {
                if (numFound == 0) {
                    System.out.println("Search results for songs released in " + year + ":");
                }
                System.out.println(playlist[i].toString());
                numFound++;
            }
        }
        if (numFound == 0) {
            System.out.println("You do not have a song released in " + year + " on your playlist.");
        }
        System.out.println();
    }

    public static void artistSearch(Music[] playlist, String artist) {
        int numFound = 0;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].getArtist().equalsIgnoreCase(artist)) {
                if (numFound == 0) {
                    System.out.println("Search results for " + artist + ":");
                }
                System.out.println(playlist[i].toString());
                numFound++;
            }
        }
        if (numFound == 0) {
            System.out.println("You do not have a song released by " + artist + " on your playlist.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPlaylist(playlist);
        titleSearch(playlist, "Down Under");
        titleSearch(playlist, "Californication");
        yearSearch(playlist, 2016);
        yearSearch(playlist, 2006);
        artistSearch(playlist, "The Who");
        artistSearch(playlist, "Matt Dylan");
    }
}