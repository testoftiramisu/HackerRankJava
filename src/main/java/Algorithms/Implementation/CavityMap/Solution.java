package Algorithms.Implementation.CavityMap;

import java.util.Scanner;


public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    private static char[][] fillTheMatrix(int rows) {
        scanner.nextLine();
        String[] arrayOfStrings = new String[rows];
        int columns = 0;

        for (int i = 0; i < rows; i++) {
            arrayOfStrings[i] = scanner.nextLine();
            columns = arrayOfStrings[i].length();
        }

        char[][] matrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            char[] charArray = arrayOfStrings[i].toCharArray();
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = charArray[j];
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int size = scanner.nextInt();
        char[][] matrix = fillTheMatrix(size);
        char[][] outputMatrix = matrix;

        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < matrix[0].length - 1; j++) {
                char up = matrix[i - 1][j];
                char down = matrix[i + 1][j];
                char left = matrix[i][j - 1];
                char right = matrix[i][j + 1];
                char item = matrix[i][j];

                if (item > up && item > down && item > left && item > right) {
                    outputMatrix[i][j] = 'X';
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < outputMatrix[0].length; j++) {
                System.out.print(outputMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
