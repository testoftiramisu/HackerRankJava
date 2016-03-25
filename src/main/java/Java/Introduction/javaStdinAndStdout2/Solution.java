package Java.Introduction.javaStdinAndStdout2;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inteValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + inteValue);
    }
}
