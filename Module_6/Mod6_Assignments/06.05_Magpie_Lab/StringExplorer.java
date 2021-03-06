/**
 * A program to allow students to try out different String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer {
    public static void main(String[] args) {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        // Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = " + position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        // Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = " + isEqual + "\n");

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  The cat could very well be man's best friend but would never stoop to admitting it.  ";

        // Add examples below for the following methods:
        // trim()
        System.out.println("Before Trim: " + sample);
        System.out.println("After Trim: " + sample.trim());
        // length()
        System.out.println("Length of sample: " + sample.length());
        // indexOf with one and two parameters
        System.out.println("The location of c is: " + sample.indexOf("c"));
        System.out.println("The second location of c is: " + sample.indexOf('c', 10));
        // substring() with one and two parameters
        System.out.println("New Substring: " + sample.substring(10));
        System.out.println("Newer Substring: " + sample.substring(10, 20));
        // compareTo()
        System.out.println("Comparing sample to \"Cats\" returns: " + sample.compareTo("Cats"));
        // any other String methods you'd like to try

    }

}
