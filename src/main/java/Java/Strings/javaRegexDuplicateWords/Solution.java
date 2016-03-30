package Java.Strings.javaRegexDuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String pattern = "\\b(\\w+)(\\s+\\1)+\\b";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String input = scanner.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}



