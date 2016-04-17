package ThirtyDaysOfCode.Day10.BinaryNumbers;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    private static String toBinaryString(int n) {
        String result = "";
        while (n > 0) {
            int reminder = n % 2;
            n = n / 2;
            result+= reminder;
        }
        return result;
    }

    public static void main(String[] args) {
        int input = scanner.nextInt();
        String binaryRepresentation = toBinaryString(input);

        char[] array = binaryRepresentation.toCharArray();

        int max = 0;
        int count = 0;
        for (char character: array) {
            if (character== '0') {
                count = 0;
            } else {
                count++;
            }

            if(count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
