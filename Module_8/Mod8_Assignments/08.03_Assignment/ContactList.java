public class ContactList {
    public static Entry[] contactList = new Entry[] {
            new Entry("Irvin", "Friend", "12/21/1947", "8065440020", "IrvinEMeyer@jourrapide.com"),
            new Entry("Tim R", "Grandfather", "5/11/1939", "8608158971", "TimothyVManning@rhyta.com"),
            new Entry("Steph", "Aunt", "1/13/1987", "3475964889", "StephenieCDomenech@rhyta.com"),
            new Entry("Mrs. Crowder", "Piano Teacher", "4/16/1968", "6197276075", "FrancesSCrowder@dayrep.com"),
            new Entry("Nick", "Uncle", "10/25/1988", "6782171337", "NicholasALee@armyspy.com"),
            new Entry("Mr. Tucci", "Baseball Coach", "4/3/1955", "8067915356", "GarryCTucci@dayrep.com"),
            new Entry("Evan Mason", "Family Friend", "10/2/1977", "8506924356", "EvanTMason@dayrep.com"),
            new Entry("David", "Friend", "12/24/2003", "8016496444", "DavidKQuintana@jourrapide.com"),
            new Entry("Raul", "Teamate", "8/7/2000", "7186454157", "RaulAOtt@teleworm.us"),
            new Entry("John from College", "Admissions Counselor", "3/28/1989", "2485011235",
                    "JohnAZuniga@teleworm.us") };

    public static void printContacts(Entry[] contactList) {
        for (Entry e : contactList) {
            System.out.println(e.toString());
        }
    }

    public static void sortByName(Entry[] contactList) {
        Entry[] temp = new Entry[contactList.length];
        for (int i = 0; i < contactList.length; i++) {
            String min = "";

            for (int index = i; index < contactList.length; i++) {
                if (min.compareTo(contactList[i].getName()) < 0) {
                    temp[i] = contactList[index];
                    System.out.println(index);
                }
            }
        }
        printContacts(temp);
    }

    public static void main(String[] args) {
        printContacts(contactList);
        sortByName(contactList);
    }
}
