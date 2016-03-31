package Java.BigNumber.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final BigInteger a = scanner.nextBigInteger();
        final BigInteger b = scanner.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);

        System.out.println(sum);
        System.out.println(mul);
    }
}
