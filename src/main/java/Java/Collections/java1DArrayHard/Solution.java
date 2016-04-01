package Java.Collections.java1DArrayHard;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            boolean win = false;
            int size = scanner.nextInt();
            int jump = scanner.nextInt();
            int[] array = new int[size];

            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }

            for (int j = 0; j < size; j++) {
                if (j + jump >= size || j + 1 == size) {
                    win = true;
                    break;
                }
                if ((j + jump < size) && (array[j + 1] == 1) && ((j + jump) < size) && (array[j + jump] == 1)) {
                    break;
                } else {
                    if (array[j + 1] != 1) {
                        j++;
                    } else if ((array[j + jump] != 1) && (j + jump < size)) {
                        j += jump;
                    }
                }
            }

            if (win) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}


