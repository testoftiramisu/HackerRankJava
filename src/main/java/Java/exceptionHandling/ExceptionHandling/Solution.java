package Java.exceptionHandling.ExceptionHandling;

import java.util.Scanner;

class Calculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new java.lang.Exception("n and p should be non-negative");
        }

        if (p == 0) {
            return 1;
        }

        long pow = n;
        for (int i = 1; i < p; i++) {
            pow *= n;
        }
        return pow;
    }
}

class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] argh) {

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator calculator = new Calculator();
            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
}

