/**
 * Purpose:
 *
 * @author Andrew Martin
 * @version 2.0
 * @since 3/19/2021
 *
 */

public class MovieTesterV2 {
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

    public static void sortByTitle(boolean ascending) {
        Movie[] temp = new Movie[movies.length];
        int insertLocation;
        if (ascending) {
            System.out.println("Sorting By title ascending\n");
            for (int i = 0; i < movies.length; i++) {
                insertLocation = 0;
                for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                    if (movies[i].getTitle().compareTo(temp[movieBeingSorted - 1].getTitle()) > 0) {
                        insertLocation = movieBeingSorted;
                    } else {
                        temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                    }
                }
                temp[insertLocation] = movies[i];
            }
        } else {
            System.out.println("Sorting By title decending\n");
            for (int i = 0; i < movies.length; i++) {
                insertLocation = 0;
                for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                    if (movies[i].getTitle().compareTo(temp[movieBeingSorted - 1].getTitle()) < 0) {
                        insertLocation = movieBeingSorted;
                    } else {
                        temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                    }
                }
                temp[insertLocation] = movies[i];
            }
        }
        for (int i = 0; i < movies.length; i++) {
            movies[i] = temp[i];
        }

    }

    public static void sortByYear(boolean ascending) {
        Movie[] temp = new Movie[movies.length];
        int insertLocation;
        if (ascending) {
            System.out.println("Sorting by year ascending\n");
            for (int i = 0; i < movies.length; i++) {
                insertLocation = 0;
                for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                    if (movies[i].getYear() > temp[movieBeingSorted - 1].getYear()) {
                        insertLocation = movieBeingSorted;
                    } else {
                        temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                    }
                }
                temp[insertLocation] = movies[i];
            }
        } else {
            System.out.println("Sorting by year descending\n");
            for (int i = 0; i < movies.length; i++) {
                insertLocation = 0;
                for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                    if (movies[i].getYear() < temp[movieBeingSorted - 1].getYear()) {
                        insertLocation = movieBeingSorted;
                    } else {
                        temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                    }
                }
                temp[insertLocation] = movies[i];
            }
        }
        for (int i = 0; i < movies.length; i++) {
            movies[i] = temp[i];
        }
    }

    public static void sortByStudio(boolean ascending) {
        Movie[] temp = new Movie[movies.length];
        int insertLocation;
        if (ascending) {
            System.out.println("Sorting By studio ascending\n");
            for (int i = 0; i < movies.length; i++) {
                insertLocation = 0;
                for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                    if (movies[i].getStudio().compareTo(temp[movieBeingSorted - 1].getStudio()) > 0) {
                        insertLocation = movieBeingSorted;
                    } else {
                        temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                    }
                }
                temp[insertLocation] = movies[i];
            }
        } else {
            System.out.println("Sorting By studio ascending\n");
            for (int i = 0; i < movies.length; i++) {
                insertLocation = 0;
                for (int movieBeingSorted = i; movieBeingSorted > 0 && insertLocation == 0; movieBeingSorted--) {
                    if (movies[i].getStudio().compareTo(temp[movieBeingSorted - 1].getStudio()) < 0) {
                        insertLocation = movieBeingSorted;
                    } else {
                        temp[movieBeingSorted] = temp[movieBeingSorted - 1];
                    }
                }
                temp[insertLocation] = movies[i];
            }
        }
        for (int i = 0; i < movies.length; i++) {
            movies[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        printMovies();
        sortByTitle(true);
        printMovies();
        sortByTitle(false);
        printMovies();
        sortByYear(true);
        printMovies();
        sortByYear(false);
        printMovies();
        sortByStudio(true);
        printMovies();
        sortByStudio(false);
        printMovies();
    }
}
