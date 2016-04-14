package ThirtyDaysOfCode.Day7.Arrays;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] reverseArray = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            reverseArray[n - 1 - i] = array[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        scanner.close();
    }
}
