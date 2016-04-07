package Java.ObjectOrientedProgramming.javaInstanceOfKeyword;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}


public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof Student) {
                a++;
            }
            if (element instanceof Rockstar) {
                b++;
            }
            if (element instanceof Hacker) {
                c++;
            }
        }
        return Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
    }

    public static void main(String[] argh) {
        ArrayList<Object> mylist = new ArrayList<>();
        int numberOfTests = scanner.nextInt();
        for (int i = 0; i < numberOfTests; i++) {
            String s = scanner.next();
            if (s.equals("Student")) {
                mylist.add(new Student());
            }
            if (s.equals("Rockstar")) {
                mylist.add(new Rockstar());
            }
            if (s.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }
        System.out.println(count(mylist));
    }
}

