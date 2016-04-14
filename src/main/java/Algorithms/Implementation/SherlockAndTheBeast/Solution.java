package Algorithms.Implementation.SherlockAndTheBeast;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = n, j; i >= 0; i--) {
                if ((i % 3 == 0) && ((n - i) % 5 == 0)) {
                    for (j = 0; j < i; j++) {
                        stringBuilder.append("5");
                    }
                    for (int k = j; k < n; k++) {
                        stringBuilder.append("3");
                    }
                    break;
                }
            }

            if (stringBuilder.length() == 0) {
                System.out.println("-1");
            } else {
                System.out.println(stringBuilder);
            }
        }
    }
}
