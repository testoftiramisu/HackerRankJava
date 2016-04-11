package ThirtyDaysOfCode.Day4.ClassVSInstance;

import java.util.Scanner;

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        this.age += 1;
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}
