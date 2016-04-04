package Java.Collections.JavaHashset;

import java.util.HashSet;
import java.util.Scanner;

class Solution {
    private static Scanner scanner = new Scanner(System.in);
    private static HashSet<String> names = new HashSet<>();

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String namesPair = scanner.nextLine();
            names.add(namesPair);
            System.out.println(names.size());
        }
        scanner.close();
    }
}
