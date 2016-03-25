package Algorithms.Warmup.solveMeFirst;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();

        System.out.println(solveMeFirst(a, b));
    }

    public static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
