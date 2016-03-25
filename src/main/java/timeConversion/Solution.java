package timeConversion;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        System.out.println(convert(input));
    }

    public static String convert(String input) {
        String hours = input.substring(0, 2);
        String output = input.substring(2, 8);

        if (input.contains("12")) {
            if (input.contains("PM")) {
                hours = "12";
            } else {
                hours = "00";
            }
        } else if (input.contains("PM")) {
            hours = Integer.parseInt(hours) + 12 + "";
        }

        return hours + output;
    }
}
