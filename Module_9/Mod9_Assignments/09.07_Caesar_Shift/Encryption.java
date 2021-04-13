import java.util.ArrayList;

public class Encryption {
    public static int shiftKey;
    private static final String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    private static String[] cypherAlphabet = new String[26];

    public static void generateCypher(int key) {
        shiftKey = key;
        int index = shiftKey;
        for (int i = 0; i < cypherAlphabet.length; i++) {
            if (index == 26) {
                index = 0;
            }
            cypherAlphabet[i] = alphabet[index];
            index++;
        }
        for (String s : alphabet) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : cypherAlphabet) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String encryptString(String toEncrypt) {
        String[] temp = toEncrypt.split("");
        String encryptedString = "";
        for (int i = 0; i < temp.length; i++) {
            int loc = 0;
            while (loc < alphabet.length - 1 && !alphabet[loc].equalsIgnoreCase(temp[i])) {
                loc++;
            }
            temp[i] = cypherAlphabet[loc];
            encryptedString = String.join("", encryptedString, temp[i]);
        }
        return encryptedString;
    }
}