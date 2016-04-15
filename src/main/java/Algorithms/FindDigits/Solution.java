package Algorithms.FindDigits;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            String string = Integer.toString(n);
            char[] array = string.toCharArray();
            int divisible = 0;

            for (char character : array) {
                if (character == '0') {
                    continue;
                }
                if (n % Character.getNumericValue(character) == 0) {
                    divisible++;
                }
            }
            System.out.println(divisible);
        }
    }
}



