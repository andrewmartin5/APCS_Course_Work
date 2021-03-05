/**
 * This class tests the student class by creating an array of students, then
 * printing them out.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 03/02/21
 */

public class Tester {
    public static void main(String[] args) {
        Student[] students = { new Student("Kyle", 88.9, 90.6), new Student("Jeff", 95.8, 86.4),
                new Student("Jim", 76.3, 80.1), new Student("Dylan", 97.8, 99.4), new Student("Caleb", 87.6, 91.2) };

        System.out.printf("%s %17s %15s %14s %14s %n", "Student", "Quiz 1 Grade", "Quiz 2 Grade", "Difference",
                "Average");
        System.out.println("==========================================================================");

        // prints the PlanetV10 array of objects using the toString() method
        for (Student s : students) {
            System.out.printf("%-6s %13.1f %16.1f %14.1f %16.1f %n", s.getName(), s.getQuizOne(), s.getQuizTwo(),
                    s.calcGradeDiff(), s.calcGradeAvg());
        }
    }
}
