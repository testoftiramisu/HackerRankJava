package ThirtyDaysOfCode.Day0.HelloWorld;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = scanner.nextLine(); // read a line of input and save it to a variable
        scanner.close(); // close the scanner

        System.out.println("Hello, World.");
        System.out.println(inputString);

    }
}
