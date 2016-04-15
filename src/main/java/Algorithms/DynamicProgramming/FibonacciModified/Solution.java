package Algorithms.DynamicProgramming.FibonacciModified;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    private static BigInteger calculateNext(BigInteger first, BigInteger second) {
        return second.multiply(second).add(first);
    }

    public static void main(String[] args) {
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int n = scanner.nextInt();

        BigInteger[] array = new BigInteger[n];
        array[0] = new BigInteger(String.valueOf(first));
        array[1] = new BigInteger(String.valueOf(second));

        for (int i = 2; i < n; i++) {
            array[i] = calculateNext(array[i - 2], array[i - 1]);
        }
        System.out.println(array[n - 1]);
    }
}
