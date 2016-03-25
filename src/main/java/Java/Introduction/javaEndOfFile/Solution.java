package Java.Introduction.javaEndOfFile;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(count++ + " " + line);
        }
    }
}
