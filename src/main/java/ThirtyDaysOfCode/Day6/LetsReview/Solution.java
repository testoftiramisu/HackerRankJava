package ThirtyDaysOfCode.Day6.LetsReview;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.nextLine();

        for (int n = 0; n < tests; n++) {
            String string = scanner.nextLine();
            String result = "Funny";

            char[] array = string.toCharArray();

            for (int i = 1, j = array.length - 2; i < array.length; i++, j--) {
                if (Math.abs(array[i] - array[i - 1]) != Math.abs(array[j] - array[j + 1])) {
                    result = "Not Funny";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}



