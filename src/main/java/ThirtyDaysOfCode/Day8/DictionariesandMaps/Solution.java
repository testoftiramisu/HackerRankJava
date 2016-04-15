package ThirtyDaysOfCode.Day8.DictionariesAndMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, Integer> phoneBook = new HashMap<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            phoneBook.put(name, phone);
        }

        while (scanner.hasNext()) {
            String s = scanner.next();

            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
