package Java.BigNumber.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        Arrays.sort(strings, (a, b) -> {
            int x = new BigDecimal(a).compareTo(new BigDecimal(b));
            return (x == 0) ? 1 : -x;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }
    }
}
