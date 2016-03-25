package Java.Strings.javaAnagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()){
           return false;
        }

        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if (Arrays.equals(arrayA, arrayB)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = scanner.next();
        String b = scanner.next();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
