package Algorithms.Warmup.DiagonalDifference;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    primarySum += a[i][j];
                    secondarySum += a[i][n - 1 - j];
                }
            }
        }

        System.out.println(Math.abs(primarySum - secondarySum));
    }
}
