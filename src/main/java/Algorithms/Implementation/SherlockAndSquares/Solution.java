package Algorithms.Implementation.SherlockAndSquares;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double count = Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1;

            System.out.println((int)count);
        }
    }
}
