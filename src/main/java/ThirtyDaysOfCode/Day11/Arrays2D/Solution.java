package ThirtyDaysOfCode.Day11.Arrays2D;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);
    private final static int SIZE = 6;

    public static void main(String[] args) {

        int arr[][] = new int[SIZE][SIZE];
        int sum, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for (int i = 0; i < SIZE - 2; i++) {
            for (int j = 0; j < SIZE - 2; j++) {
                sum = getHourglassSum(arr, i, j);
                if (sum >= maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    private static int getHourglassSum(int[][] array, final int i, final int j) {
        int sum = 0;
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                sum += array[k][l];
            }
        }
        return sum - array[i + 1][j] - array[i + 1][j + 2];
    }
}

