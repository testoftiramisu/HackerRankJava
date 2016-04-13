package ThirtyDaysOfCode.Day6.LetsReview;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.nextLine();

        //|c−a|=2=|x−z|


        for (int n = 0; n < tests; n++) {
            String string = scanner.nextLine();

            char[] array = string.toCharArray();

            for (int i = 1, j = array.length - 2; i < array.length; i++, j--) {
                if (Math.abs(array[i] - array[i - 1]) != Math.abs(array[j] - array[j + 1])) {
                    System.out.println("Not Funny");
                    break;
                }
                System.out.println("Funny");
            }
        }
    }
}



