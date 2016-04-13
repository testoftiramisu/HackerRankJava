package Algorithms.Implementation.UtopianTree;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {
            int cycles = scanner.nextInt();
            int height = 1;

            for (int j = 1; j <= cycles; j++) {
                if (j % 2 == 0) {
                    height += 1;
                } else {
                    height *= 2;
                }
            }
            System.out.println(String.valueOf(height));
        }
    }
}
