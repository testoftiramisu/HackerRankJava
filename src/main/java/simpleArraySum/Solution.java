package simpleArraySum;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int length = scanner.nextInt();
        int sum = 0;
        scanner.nextLine();

        for (int i = 0; i < length; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
