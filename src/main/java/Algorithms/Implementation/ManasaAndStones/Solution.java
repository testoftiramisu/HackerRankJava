package Algorithms.Implementation.ManasaAndStones;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt() - 1;
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b < a){
                int tmp = a;
                a = b;
                b = tmp;
            }

            int difference = b - a;
            int current = n * a;
            int max = n * b;

            if (a == b) {
                System.out.println(current);
            } else {
                String output = "";
                while (current <= max) {
                    output += current + " ";
                    current += difference;
                }
                System.out.println(output);
            }
        }
    }
}
