package Algorithms.Implementation.CaesarCipher;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int k = scanner.nextInt();

        if (k > 26) {
            k %= 26;
        }

        char[] inputArray = input.toCharArray();
        char[] outputArray = new char[n];

        for (int i = 0; i < n; i++) {
            char ch = inputArray[i];
            int newValue = ((int) ch + k);

            if ((Character.isUpperCase(ch) && newValue > 90) || (Character.isLowerCase(ch) && newValue > 122)) {
                outputArray[i] = (char) (newValue - 26);
            } else if (Character.isLetter(ch)) {
                outputArray[i] = (char) newValue;
            } else {
                outputArray[i] = inputArray[i];
            }
        }
        System.out.println(outputArray);
    }
}
