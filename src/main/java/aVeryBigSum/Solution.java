package aVeryBigSum;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int length = scanner.nextInt();
        long sum = 0;

        scanner.nextLine();

        for (int i = 0; i < length; i++) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
