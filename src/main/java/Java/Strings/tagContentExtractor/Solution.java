package Java.Strings.tagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = Integer.parseInt(scanner.nextLine());
        String pattern = "<([\\p{Print}&&[^<>]]([\\p{Print}&&[^<>]]|\\p{Blank})*)>([^<]+)</\\1>";
        Pattern r = Pattern.compile(pattern);


        while (testCases > 0) {
            String line = scanner.nextLine();
            Matcher matcher = r.matcher(line);
            boolean findMatch = false;

            while (matcher.find()) {
                System.out.println(matcher.group(3));
                findMatch = true;
            }

            if (!findMatch) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}

