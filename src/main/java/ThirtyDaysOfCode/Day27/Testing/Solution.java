package ThirtyDaysOfCode.Day27.Testing;

import java.util.Scanner;

//  Sample input:
//
//  5
//  5 4
//  -1 -3 4 2 0
//  7 1
//  0 -1 -2 1 4 -6 -5
//  6 4
//  -1 -3 4 2 0 1
//  8 2
//  0 -1 -2 1 4 -2 -1 -3
//  3 3
//  -1 0 4

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean isCancelled(int threshold, int[] arrivalTimes) {
        int count = 0;
        for (int arrivalTime : arrivalTimes) {
            if (arrivalTime <= 0) {
                count++;
            }
        }
        return count < threshold;
    }

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int students = scanner.nextInt();
            int threshold = scanner.nextInt();
            int[] array = new int[students];

            for (int i = 0; i < students; i++) {
                array[i] = scanner.nextInt();
            }

            if (isCancelled(threshold, array)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}