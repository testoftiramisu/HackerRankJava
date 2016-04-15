package Algorithms.Sorting.IntroToTutorialChallenges;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] == v) {
                System.out.println(i);
            }
        }
    }
}
