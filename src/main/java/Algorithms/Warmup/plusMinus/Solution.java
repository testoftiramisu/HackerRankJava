package Algorithms.Warmup.PlusMinus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int length = scanner.nextInt();
        Integer positive = 0, negative = 0, zeroes = 0;

        scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < length; i++) {
            Integer number = scanner.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeroes++;
            }
        }

        System.out.println((float)positive/length);
        System.out.println((float)negative/length);
        System.out.println((float)zeroes/length);

    }


}
