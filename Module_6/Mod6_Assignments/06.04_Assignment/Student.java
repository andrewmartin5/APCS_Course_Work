/**
 * This class creates a student with a name and two quiz grades, provides
 * methods for accessing the values, as well as methods to calculate the
 * difference and average of the two values.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 03/02/21
 */

public class Student {
    private String name;
    private Double quizOne;
    private Double quizTwo;

    public Student(String studentName, Double firstQuiz, Double secondQuiz) {
        name = studentName;
        quizOne = firstQuiz;
        quizTwo = secondQuiz;
    }

    public String getName() {
        return name;
    }

    public Double getQuizOne() {
        return quizOne;
    }

    public Double getQuizTwo() {
        return quizTwo;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setQuizOne(double newGrade) {
        quizOne = newGrade;
    }

    public void setQuizTwo(double newGrade) {
        quizTwo = newGrade;
    }

    public Double calcGradeDiff() {
        return quizTwo - quizOne;
    }

    public Double calcGradeAvg() {
        return (quizOne + quizTwo) / 2;
    }
}
