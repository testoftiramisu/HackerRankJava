package ThirtyDaysOfCode.Day25.RunningTimeAndComplexity;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        while (tests-- > 0) {
            if (isPrime(scanner.nextInt())){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }

        }
    }
}
