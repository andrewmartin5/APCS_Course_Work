/**
 * This class creates student objects that can store names and quizzes.
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/18/2021
 */

public class Student {
    private String name;
    private int quizOne;
    private int quizTwo;
    private int quizThree;
    private int quizFour;
    private int quizFive;

    Student(String studentName, int firstQuiz, int secondQuiz, int thirdQuiz, int fourthQuiz, int fifthQuiz) {
        name = studentName;
        quizOne = firstQuiz;
        quizTwo = secondQuiz;
        quizThree = thirdQuiz;
        quizFour = fourthQuiz;
        quizFive = fifthQuiz;
    }

    public int getQuiz(int quizNum) {
        if (quizNum == 5) {
            return quizFive;
        } else if (quizNum == 4) {
            return quizFour;
        } else if (quizNum == 3) {
            return quizThree;
        } else if (quizNum == 2) {
            return quizTwo;
        } else if (quizNum == 1) {
            return quizOne;
        } else {
            return 0;
        }
    }

    public void updateQuiz(int quizNum, int newGrade) {
        if (quizNum == 5) {
            quizFive = newGrade;
        } else if (quizNum == 4) {
            quizFour = newGrade;
        } else if (quizNum == 3) {
            quizThree = newGrade;
        } else if (quizNum == 2) {
            quizTwo = newGrade;
        } else if (quizNum == 1) {
            quizOne = newGrade;
        } else {
            System.out.println("Sorry, we could not find your quiz in the system.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        return String.format("%-10s%10d%10d%10d%10d%10d", name, quizOne, quizTwo, quizThree, quizFour, quizFive);
    }
}