package Algorithms.Implementation.AngryProfessor;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int array[] = new int[n];

            int studentsOnTime = 0;

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                if (array[i] <= 0) {
                    studentsOnTime++;
                }
            }

            if (studentsOnTime < k){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
