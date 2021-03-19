
/**
 * This class tests the student class by creating an arraylist and modifying it
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/18/2021
 */

import java.util.ArrayList;

public class testStudent {
    public static void printTable(ArrayList<Student> list) {
        System.out.println("Gradebook:");
        System.out.printf("%-10s%10s%10s%10s%10s%10s%n", "Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("============================================================");
        for (int i = 0; i < list.size() && list.get(i) != null; i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println();
    }

    public static void replaceName(ArrayList<Student> list, String oldName, String newName) {
        int location = 0;
        while (location < list.size() && list.get(location) != null && !list.get(location).getName().equals(oldName)) {
            location++;
        }
        if (location == 5) {
            System.out.println("Sorry, we could not find your student.\n");
        } else {
            System.out.println("<< Replacing " + oldName + " with " + newName + " >>\n");
            list.get(location).setName(newName);
        }
    }

    public static void updateGrade(ArrayList<Student> list, String student, int quizNum, int grade) {
        int location = 0;
        while (location < list.size() && list.get(location) != null && !list.get(location).getName().equals(student)) {
            location++;
        }
        if (location == 5) {
            System.out.println("Sorry, we could not find your student.\n");
        } else {
            System.out.println("<< Updating " + student + "'s quiz " + quizNum + " grade to " + grade + " >>\n");
            list.get(location).updateQuiz(quizNum, grade);
        }
    }

    public static void replaceStudent(ArrayList<Student> list, String student, Student newStudent) {
        int location = 0;
        while (location < list.size() && list.get(location) != null && !list.get(location).getName().equals(student)) {
            location++;
        }
        if (location == 5) {
            System.out.println("Sorry, we could not find your student.\n");
        } else {
            System.out.println("<< Replacing " + student + " with " + newStudent.getName() + " >>\n");
            list.set(location, newStudent);
        }
    }

    public static void insertStudent(ArrayList<Student> list, String insertBefore, Student newStudent) {
        int location = 0;
        while (location < list.size() && list.get(location) != null
                && !list.get(location).getName().equals(insertBefore)) {
            location++;
        }
        if (location == 5) {
            System.out.println("Sorry, we could not find your student.\n");
        } else {
            System.out.println("<< Inserting " + newStudent.getName() + " before " + insertBefore + " >>\n");
            list.add(list.get(list.size() - 1));
            for (int i = list.size() - 1; i > location; i--) {
                list.set(i, list.get(i - 1));
            }
            list.set(location, newStudent);
        }
    }

    public static void deleteStudent(ArrayList<Student> list, String name) {
        int location = 0;
        while (location < list.size() && list.get(location) != null && !list.get(location).getName().equals(name)) {
            location++;
        }
        if (location == 5) {
            System.out.println("Sorry, we could not find your student.\n");
        } else {
            System.out.println("<< Deleting " + name + " >>\n");
            for (int i = location + 1; i < list.size(); i++) {
                list.set(i - 1, list.get(i));
            }
            list.set(list.size() - 1, null);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Karl", 86, 85, 94, 79, 98));
        students.add(new Student("Brad", 96, 97, 80, 95, 91));
        students.add(new Student("Nisha", 99, 98, 100, 96, 93));
        students.add(new Student("Adam", 79, 83, 92, 86, 88));
        students.add(new Student("Lucas", 83, 95, 91, 89, 86));

        printTable(students);
        replaceName(students, "Adam", "Josh");
        printTable(students);
        updateGrade(students, "Karl", 1, 94);
        printTable(students);
        replaceStudent(students, "Josh", new Student("Adam", 90, 87, 95, 98, 83));
        printTable(students);
        insertStudent(students, "Adam", new Student("Josh", 70, 74, 86, 73, 90));
        printTable(students);
        deleteStudent(students, "Josh");
        printTable(students);
    }
}
