/**
 * Purpose:
 *
 * @author Andrew Martin
 * @version 3.0
 * @since 3/19/2021
 *
 */

public class MovieTesterV3 {
    static Movie[] movies = new Movie[] { new Movie("Casino Royale", 2006, "Sony Pictures"),
            new Movie("Quantum of Solace", 2008, "Sony Pictures"), new Movie("Real Steel", 2011, "Walt Disney Studios"),
            new Movie("Avatar", 2009, "20th Century Fox"), new Movie("The Martian", 2015, "20th Century Fox"),
            new Movie("Godzilla", 2014, "Warner Bros. Pictures"),
            new Movie("Kong: Skull Island", 2017, "Warner Bros. Pictures"),
            new Movie("Godzilla: King of the Monsters", 2019, "Warner Bros. Pictures"),
            new Movie("Pacific Rim", 2013, "Warner Bros. Pictures"),
            new Movie("Pacific Rim: Uprising", 2018, "Universal Pictures") };

    public static void printMovies() {
        System.out.println("Printing Movies: \n");
        System.out.println("Title:                         Year:  Distributer:");
        System.out.println("===========================================================");
        for (Movie i : movies) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    public static void sortByTitle(int ascending) {
        int insertLocation;
        int maximum;
        int testPos;
        Movie temp;
        if (ascending == 1) {
            System.out.println("Sorting by title ascending\n");
            for (int i = movies.length - 1; i >= 0; i--) {
                maximum = 0;
                for (testPos = 0; testPos <= i; testPos++) {
                    if (movies[testPos].getTitle().compareTo(movies[maximum].getTitle()) > 0) {
                        maximum = testPos;
                    }
                }
                temp = movies[i];
                movies[i] = movies[maximum];
                movies[maximum] = temp;
            }
        } else {
            System.out.println("Sorting by title descending\n");
            for (int i = movies.length - 1; i >= 0; i--) {
                maximum = 0;
                for (testPos = 0; testPos <= i; testPos++) {
                    if (movies[testPos].getTitle().compareTo(movies[maximum].getTitle()) < 0) {
                        maximum = testPos;
                    }
                }
                temp = movies[i];
                movies[i] = movies[maximum];
                movies[maximum] = temp;
            }
        }
    }

    public static void sortByYear(int ascending) {
        int maximum;
        int testPos;
        Movie temp;
        if (ascending == 1) {
            System.out.println("Sorting by year ascending\n");
            for (int i = movies.length - 1; i >= 0; i--) {
                maximum = 0;
                for (testPos = 0; testPos <= i; testPos++) {
                    if (movies[testPos].getYear() > movies[maximum].getYear()) {
                        maximum = testPos;
                    }
                }
                temp = movies[i];
                movies[i] = movies[maximum];
                movies[maximum] = temp;
            }
        } else {
            System.out.println("Sorting by year descending\n");
            for (int i = movies.length - 1; i >= 0; i--) {
                maximum = 0;
                for (testPos = 0; testPos <= i; testPos++) {
                    if (movies[testPos].getYear() < movies[maximum].getYear()) {
                        maximum = testPos;
                    }
                }
                temp = movies[i];
                movies[i] = movies[maximum];
                movies[maximum] = temp;
            }
        }
    }

    public static void sortByStudio(int ascending) {
        int maximum;
        int testPos;
        Movie temp;
        if (ascending == 1) {
            System.out.println("Sorting by studio ascending\n");
            for (int i = movies.length - 1; i >= 0; i--) {
                maximum = 0;
                for (testPos = 0; testPos <= i; testPos++) {
                    if (movies[testPos].getStudio().compareTo(movies[maximum].getStudio()) > 0) {
                        maximum = testPos;
                    }
                }
                temp = movies[i];
                movies[i] = movies[maximum];
                movies[maximum] = temp;
            }
        } else {
            System.out.println("Sorting by studio descending\n");
            for (int i = movies.length - 1; i >= 0; i--) {
                maximum = 0;
                for (testPos = 0; testPos <= i; testPos++) {
                    if (movies[testPos].getStudio().compareTo(movies[maximum].getStudio()) < 0) {
                        maximum = testPos;
                    }
                }
                temp = movies[i];
                movies[i] = movies[maximum];
                movies[maximum] = temp;
            }
        }
    }

    public static void main(String[] args) {
        printMovies();
        sortByTitle(1);
        printMovies();
        sortByTitle(2);
        printMovies();
        sortByYear(1);
        printMovies();
        sortByYear(2);
        printMovies();
        sortByStudio(1);
        printMovies();
        sortByStudio(2);
        printMovies();
    }
}
