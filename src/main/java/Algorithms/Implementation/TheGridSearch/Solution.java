package Algorithms.Implementation.TheGridSearch;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    private static int[][] fillTheMatrix(int rows, int columns) {
        scanner.nextLine();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            String row = scanner.nextLine();
            char[] items = row.toCharArray();
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Character.getNumericValue(items[j]);
            }
        }
        return matrix;
    }

    private static boolean isPresent(int[][] big, int[][] small) {
        int bigRows = big.length;
        int bigColumns = big[0].length;
        int smallRows = small.length;
        int smallColumns = small[0].length;
        String find;

        for (int i = 0; i < bigRows; i++) {                        // Iteration over big matrix
            for (int j = 0; j < bigColumns; j++) {
                find = "YES";
                if (big[i][j] == small[0][0]) {
                    for (int k = 0; k < smallRows; k++) {          // iteration over small matrix
                        if (find.equals("NO")) {
                            break;
                        }
                        if (i + k < bigRows) {
                            for (int l = 0; l < smallColumns; l++) {
                                if (l + j < bigColumns) {
                                    if (small[k][l] != big[i + k][l + j]) {
                                        find = "NO";
                                        break;
                                    } else if (k == smallRows - 1 && l == smallColumns - 1) {
                                        return true;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int bigRows = scanner.nextInt();
            int bigColumns = scanner.nextInt();
            int[][] big = fillTheMatrix(bigRows, bigColumns);

            int smallRows = scanner.nextInt();
            int smallColumns = scanner.nextInt();
            int[][] small = fillTheMatrix(smallRows, smallColumns);

            if(isPresent(big, small)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
