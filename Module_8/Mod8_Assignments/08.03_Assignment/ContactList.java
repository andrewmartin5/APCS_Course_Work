public class ContactList {
    public static Entry[] contactList = new Entry[] {
            new Entry("Irvin", "Friend", "12/21/1947", "8065440020", "IrvinEMeyer@jourrapide.com"),
            new Entry("Tim R", "Grandfather", "05/11/1939", "8608158971", "TimothyVManning@rhyta.com"),
            new Entry("Steph", "Aunt", "01/13/1987", "3475964889", "StephenieCDomenech@rhyta.com"),
            new Entry("Mrs. Crowder", "Piano Teacher", "04/16/1968", "6197276075", "FrancesSCrowder@dayrep.com"),
            new Entry("Nick", "Uncle", "10/25/1988", "6782171337", "NicholasALee@armyspy.com"),
            new Entry("Mr. Tucci", "Baseball Coach", "04/03/1955", "8067915356", "GarryCTucci@dayrep.com"),
            new Entry("Evan Mason", "Family Friend", "10/02/1977", "8506924356", "EvanTMason@dayrep.com"),
            new Entry("David", "Friend", "12/24/2003", "8016496444", "DavidKQuintana@jourrapide.com"),
            new Entry("Raul", "Teamate", "08/07/2000", "7186454157", "RaulAOtt@teleworm.us"),
            new Entry("John from College", "Admissions Counselor", "03/28/1989", "2485011235",
                    "JohnAZuniga@teleworm.us") };

    public static void printContacts(Entry[] contactList) {
        System.out.println("Contacts:");
        for (Entry e : contactList) {
            System.out.println(e.toString());
        }
        System.out.println();
    }

    public static void sortByName(Entry[] contactList) {
        int maximum;
        int testPos;
        Entry temp;
        for (int i = contactList.length - 1; i >= 0; i--) {
            maximum = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (contactList[testPos].getName().compareTo(contactList[maximum].getName()) > 0) {
                    maximum = testPos;
                }
            }
            temp = contactList[i];
            contactList[i] = contactList[maximum];
            contactList[maximum] = temp;
        }
    }

    public static void sortByRelation(Entry[] contactList) {
        int maximum;
        int testPos;
        Entry temp;
        for (int i = contactList.length - 1; i >= 0; i--) {
            maximum = 0;
            for (testPos = 0; testPos <= i; testPos++) {
                if (contactList[testPos].getRelation().compareTo(contactList[maximum].getRelation()) > 0) {
                    maximum = testPos;
                }
            }
            temp = contactList[i];
            contactList[i] = contactList[maximum];
            contactList[maximum] = temp;
        }
    }

    public static void binaryNameSearch(Entry[] contactList, String name) {
        sortByName(contactList);
        int min = -1, max = contactList.length, temp;
        while (max - min > 1) {
            temp = (max + min) / 2;
            if (contactList[temp].getName().compareToIgnoreCase(name) > 0) {
                max = temp;
            } else {
                min = temp;
            }
        }
        if (min != -1 && contactList[min].getName().equalsIgnoreCase(name)) {
            System.out.println("Search results for " + name + ":");
            System.out.println(contactList[min].toString());
        } else {
            System.out.println(name + " is not on your contact list.\n");
        }
        System.out.println();
    }

    public static void binaryRelationSort(Entry[] contactList, String relation) {
        sortByRelation(contactList);
        int max = contactList.length;
        int min = -1;
        int temp;
        while (max - min > 1) {
            temp = (max + min) / 2;
            if (contactList[temp].getRelation().compareToIgnoreCase(relation) > 0)
                max = temp;
            else {
                min = temp;
                if (contactList[temp].getRelation().equalsIgnoreCase(relation)) {
                    break;
                }
            }
        }
        if ((min >= 0) && (contactList[min].getRelation().equalsIgnoreCase(relation))) {
            System.out.println("Search results for " + relation + ":");
            for (int i = 0; i < contactList.length; i++) {
                if (contactList[i].getRelation().equalsIgnoreCase(relation)) {
                    System.out.println(contactList[i].toString());
                }
            }
        } else
            System.out.println("Could not find " + relation + ".");
        System.out.println();
    }

    public static int getMonthFromBd(String bday) {
        bday = bday.substring(0, bday.indexOf("/"));
        if (bday.charAt(0) == 0) {
            bday = bday.substring(0);
        }
        return Integer.parseInt(bday);
    }

    public static int getNumFromPhone(String phone) {
        return 0;
    }

    public static void bdMonthSearch(Entry[] contactList, int month) {
        int numFound = 0;
        for (int i = 0; i < contactList.length; i++) {
            int bdMonth = getMonthFromBd(contactList[i].getBirthday());
            if (bdMonth == month) {
                if (numFound == 0) {
                    System.out.println("Search results for birthday in " + month + ":");
                }
                System.out.println(contactList[i].toString());
                numFound++;
            }
        }
        if (numFound == 0) {
            System.out.println("Could not find month " + month + " on your contact list.");
        }
        System.out.println();
    }

    public static void phoneSearch(Entry[] contactList, int phone) {
        int numFound = 0;
        for (int i = 0; i < contactList.length; i++) {
            if (Integer.parseInt(contactList[i].getPhone()) == phone) {
                if (numFound == 0) {
                    System.out.println("Search results for songs released in " + phone + ":");
                }
                System.out.println(contactList[i].toString());
                numFound++;
            }
        }
        if (numFound == 0) {
            System.out.println("You do not have a song released in " + phone + " on your playlist.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printContacts(contactList);
        binaryNameSearch(contactList, "Nick");
        binaryRelationSort(contactList, "aunt");
        bdMonthSearch(contactList, 4);
        phoneSearch(contactList, 2044931029);
    }
}
