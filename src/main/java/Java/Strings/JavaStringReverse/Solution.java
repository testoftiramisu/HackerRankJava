package Java.Strings.JavaStringReverse;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = scanner.next();
        String left = "";
        String right = "";
        StringBuilder builder = new StringBuilder();

        left = inputString.substring(0, inputString.length() / 2);

        if (inputString.length() % 2 == 0) {
            right = inputString.substring(inputString.length() / 2);
        } else {
            right = inputString.substring(inputString.length() / 2 + 1);
        }

        builder.append(right).reverse();

        if (left.compareTo(builder.toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
