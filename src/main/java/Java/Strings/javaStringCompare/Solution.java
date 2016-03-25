package Java.Strings.javaStringCompare;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = scanner.next();
        int k = scanner.nextInt();

        String minimum = "";
        String maximum = "";

        for (int i = 0; i <= inputString.length() - k; i++) {
            String substring = inputString.substring(i, i + k);
            if (minimum.isEmpty()) {
                minimum = substring;
            }
            if (substring.compareTo(maximum) > 0) {
                maximum = substring;
            } else if (substring.compareTo(minimum) <= 0) {
                minimum = substring;
            }
        }

        System.out.println(minimum);
        System.out.println(maximum);

    }
}
