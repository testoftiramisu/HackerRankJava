package ThirtyDaysOfCode.Day12.Inheritance;

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    public char calculate() {

        int sum = 0;
        for (int testScore : this.testScores) {
            sum += testScore;
        }

        sum /= testScores.length;

        if (sum >= 90 && sum <= 100) {
            return 'O';
        } else if (sum >= 80 && sum < 90) {
            return 'E';
        } else if (sum >= 70 && sum < 80) {
            return 'A';
        } else if (sum >= 55 && sum < 70) {
            return 'P';
        } else if (sum >= 40 && sum < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }

    public Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scanner.nextInt();
        }
        scanner.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}