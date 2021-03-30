import java.util.ArrayList;

/**
 * Purpose: To create a music array and be able to search by title, year, and
 * artist.
 *
 * @author Andrew Martin
 * @version 3.0
 * @since 3/25/2021
 *
 */

public class MusicTesterV3 {
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

    public static void titleSort(Music[] playlist) {
        int maximum;
        int testPos;
        Music temp;
        System.out.println("Sorting by title...\n");
        for (int i = playlist.length - 1; i >= 0; i--) {
            maximum = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (playlist[testPos].getTitle().compareTo(playlist[maximum].getTitle()) > 0) {
                    maximum = testPos;
                }
            }
            temp = playlist[i];
            playlist[i] = playlist[maximum];
            playlist[maximum] = temp;
        }
    }

    public static void yearSort(Music[] playlist) {
        int maximum;
        int testPos;
        Music temp;
        System.out.println("Sorting by year...\n");
        for (int i = playlist.length - 1; i >= 0; i--) {
            maximum = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (playlist[testPos].getYear() > (playlist[maximum].getYear())) {
                    maximum = testPos;
                }
            }
            temp = playlist[i];
            playlist[i] = playlist[maximum];
            playlist[maximum] = temp;
        }
    }

    public static void artistSort(Music[] playlist) {
        int maximum;
        int testPos;
        Music temp;
        System.out.println("Sorting by artist...\n");
        for (int i = playlist.length - 1; i >= 0; i--) {
            maximum = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (playlist[testPos].getArtist().compareTo(playlist[maximum].getArtist()) > 0) {
                    maximum = testPos;
                }
            }
            temp = playlist[i];
            playlist[i] = playlist[maximum];
            playlist[maximum] = temp;
        }
    }

    public static void titleSearch(Music[] playlist, String title) {
        int min = -1, max = playlist.length, temp;
        while (max - min > 1) {
            temp = (max + min) / 2;
            if (playlist[temp].getTitle().compareToIgnoreCase(title) > 0) {
                max = temp;
            } else {
                min = temp;
            }
        }
        if (min != -1 && playlist[min].getTitle().equalsIgnoreCase(title)) {
            System.out.println("Search results for " + title + ":");
            System.out.println(playlist[min].toString());
        } else {
            System.out.println(title + " is not on your playlist.\n");
        }
        System.out.println();
    }

    public static void yearSearch(Music[] playlist, int year) {
        int max = playlist.length;
        int min = -1;
        int temp;
        while (max - min > 1) {
            temp = (max + min) / 2;
            if (playlist[temp].getYear() > year)
                max = temp;
            else {
                min = temp;
                if (playlist[temp].getYear() == year) {
                    break;
                }
            }
        }
        if ((min >= 0) && (playlist[min].getYear() == year)) {
            System.out.println("Search results for songs released in " + year + ":");
            for (int i = 0; i < playlist.length; i++) {
                if (playlist[i].getYear() == year) {
                    System.out.println(playlist[i].toString());
                }
            }
        } else
            System.out.println("You do not have a song released in " + year + " on your playlist.");
        System.out.println();
    }

    public static void artistSearch(Music[] playlist, String artist) {
        int max = playlist.length;
        int min = -1;
        int temp;
        while (max - min > 1) {
            temp = (max + min) / 2;
            if (playlist[temp].getArtist().compareToIgnoreCase(artist) > 0)
                max = temp;
            else {
                min = temp;
                if (playlist[temp].getArtist().equalsIgnoreCase(artist)) {
                    break;
                }
            }
        }
        if ((min >= 0) && (playlist[min].getArtist().equalsIgnoreCase(artist))) {
            System.out.println("Search results for " + artist + ":");
            for (int i = 0; i < playlist.length; i++) {
                if (playlist[i].getArtist().equalsIgnoreCase(artist)) {
                    System.out.println(playlist[i].toString());
                }
            }
        } else
            System.out.println("You do not have a song released by " + artist + " on your playlist.");
        System.out.println();
    }

    public static void main(String[] args) {
        printPlaylist(playlist);
        titleSort(playlist);
        printPlaylist(playlist);
        titleSearch(playlist, "Down Under");
        titleSearch(playlist, "Californication");
        yearSort(playlist);
        yearSearch(playlist, 2016);
        yearSearch(playlist, 2006);
        artistSort(playlist);
        artistSearch(playlist, "The Who");
        artistSearch(playlist, "Matt Dylan");
    }
}