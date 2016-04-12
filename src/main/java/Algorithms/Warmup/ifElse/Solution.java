package Algorithms.Warmup.IfElse;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String answer = "Not Weird";

        if (n % 2 == 1) {
            answer = "Weird";
        } else if (n > 5 && n <= 20) {
            answer = "Weird";
        }

        System.out.println(answer);
    }
}
