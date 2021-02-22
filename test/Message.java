public class Message {

    private int idLength;
    private String deviceID;
    private int msgLength;
    private String textMsg;

    public Message(String msg) {
        idLength = 1;
        deviceID = "a";
        msgLength = 7;
        textMsg = "a c d e";
    }

    public boolean isValid() {
        if (idLength != deviceID.length() || msgLength != textMsg.length()) {
            return false;
        }
        return true;
    }

    public int wordCount() {
        int numWords = 1;
        for (int count = 0; count < textMsg.length(); count++) {
            if (textMsg.charAt(count) == ' ') {
                numWords++;
            }
        }
        return numWords;
    }
}