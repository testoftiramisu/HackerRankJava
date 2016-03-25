package Java.Strings.javaStringsIntroduction;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String isLarger = "Yes";
        String a = scanner.next();
        String b = scanner.next();

        int sum = a.length() + b.length();
        if (a.compareTo(b) <= 0) {
            isLarger = "No";
        }

        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);

        System.out.println(sum);
        System.out.println(isLarger);
        System.out.println(a + " " + b);

    }
}
