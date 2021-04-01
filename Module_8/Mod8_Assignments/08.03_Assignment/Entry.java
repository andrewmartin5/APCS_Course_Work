public class Entry {
    private String name, relation, birthday, phoneNum, email;

    public Entry(String contactName, String relationship, String bday, String phone, String emailAddress) {
        name = contactName;
        relation = relationship;
        birthday = bday;
        phoneNum = phone;
        email = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return (phoneNum.substring(0, 3) + "-" + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6));
    }

    public String getEmail() {
        return email;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setRelation(String newRelation) {
        relation = newRelation;
    }

    public void setBirthday(String newBirthday) {
        birthday = newBirthday;
    }

    public void setPhone(String newPhone) {
        phoneNum = newPhone;
    }

    public String toString() {
        return String.format("%-20s%-22s%-12s%-17s%-12s", name, relation, birthday, getPhone(), email);

    }
}