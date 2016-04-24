package ThirtyDaysOfCode.Day14.Scope;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int[] array = this.elements;
        Arrays.sort(array);
        maximumDifference = Math.abs(array[array.length - 1] - array[0]);
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Difference difference = new Difference(array);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
