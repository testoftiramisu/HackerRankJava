package Algorithms.Implementation.CutTheSticks;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int smallest = findSmallest(array);
        int count = 0;

        while (smallest != Integer.MAX_VALUE) {
            for (int i = 0; i < n; i++) {
                if (array[i] > 0) {
                    array[i] -= smallest;
                    if (array[i] < 0) {
                        array[i] = 0;
                    }
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
            smallest = findSmallest(array);
        }
    }

    private static int findSmallest(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < min && i != 0) {
                min = i;
            }
        }
        return min;
    }
}
