package Java.Introduction.javaLoops;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int i = 0; i < tests; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;

            for (int j = 0; j < n; j++) {
                sum += (int)(Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
