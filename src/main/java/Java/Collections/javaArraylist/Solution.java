package Java.Collections.javaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int lines = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> arraysList = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            int digits = scanner.nextInt();
            ArrayList<Integer> digitsList = new ArrayList<>();
            for (int j = 0; j < digits; j++) {
                digitsList.add(scanner.nextInt());
            }
            arraysList.add(digitsList);
        }

        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            int line = scanner.nextInt() - 1;
            int position = scanner.nextInt() - 1;

            if (line < arraysList.size()) {
                if (position < arraysList.get(line).size()) {
                    System.out.println(arraysList.get(line).get(position));
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
        scanner.close();
    }
}
