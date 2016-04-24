package Algorithms.Implementation.ChocolateFeast;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int m = scanner.nextInt();

            int total = n / c;

            int wrappers = total;

            while (wrappers >= m) {
                int newWrappers = wrappers / m;
                wrappers = wrappers % m + newWrappers;
                total += newWrappers;
            }

            System.out.println(total);
        }
    }

}
