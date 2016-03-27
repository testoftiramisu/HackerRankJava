package Java.Strings.javaStringToken;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        int wordsCount = 0;

        String[] words = input.split("[ !,?.\\_'@]+");

        for (String word: words) {
            if (!word.equals("")) {
                wordsCount++;
            }
        }

        System.out.println(wordsCount);
        for (String word: words) {
            if (!word.equals("")) {
                System.out.println(word);
            }
        }
    }
}
