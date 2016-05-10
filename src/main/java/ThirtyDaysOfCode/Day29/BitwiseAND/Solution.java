package ThirtyDaysOfCode.Day29.BitwiseAND;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static int getMax(int n, int k) {
        int maxAnd = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                int and = i & j;

                if (and > maxAnd && and < k) {
                    maxAnd = and;
                }
            }
        }

        return maxAnd;
    }

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            System.out.println(getMax(n, k));
        }
    }
}
