package ThirtyDaysOfCode.Day1.DataTypes;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";


        int intInput = Integer.parseInt(scanner.nextLine());
        double doubleInput = Double.parseDouble(scanner.nextLine());
        String stringInput = scanner.nextLine();

        System.out.println(i + intInput);
        System.out.println(d + doubleInput);
        System.out.println(s + stringInput);

        scanner.close();
    }
}

