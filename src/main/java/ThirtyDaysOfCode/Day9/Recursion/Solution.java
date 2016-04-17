package ThirtyDaysOfCode.Day9.Recursion;

import java.util.Scanner;

public class Solution {
private static Scanner scanner = new Scanner(System.in);

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
}
