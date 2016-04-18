package Algorithms.Implementation.ServiceLane;

import java.util.Scanner;

public class Solution {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int tests = scanner.nextInt();
        int[] width = new int[n];

        for (int i = 0; i < n; i++) {
            width[i] = scanner.nextInt();
        }

        for (int t = 0; t < tests; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = 3;

            for (int i = a; i <= b; i++) {
                if (width[i] < min) {
                    min = width[i];
                }
            }
            System.out.println(min);
        }
    }
}
