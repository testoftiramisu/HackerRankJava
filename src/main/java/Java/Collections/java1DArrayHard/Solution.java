package Java.Collections.java1DArrayHard;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int number = scanner.nextInt();
        final int ZERO_INDEX = 0;

        for (int i = 0; i < number; i++) {
            int size = scanner.nextInt();
            int jump = scanner.nextInt();
            int[] array = new int[size];

            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }

            if (isWinning(ZERO_INDEX, jump, array)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isWinning(int j, int jump, int[] array) {
        if (j < 0 || array[j] == 1) {
            return false;
        } else if ((j == array.length - 1) || j + jump > array.length - 1) {
            return true;
        }

        array[j] = 1;

        return isWinning(j + 1, jump, array) || isWinning(j - 1, jump, array) || isWinning(j + jump, jump, array);

    }
}


