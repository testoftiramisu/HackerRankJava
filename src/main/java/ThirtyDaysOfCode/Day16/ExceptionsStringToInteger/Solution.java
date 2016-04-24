package ThirtyDaysOfCode.Day16.ExceptionsStringToInteger;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();

        try {
            System.out.println(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
