package staircase;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            int j = 0, k = 0;
            while (j != size - i) {
                System.out.print(" ");
                j++;
            }
            while (k != i) {
                System.out.print("#");
                k++;
            }
            System.out.println();
        }
    }
}
