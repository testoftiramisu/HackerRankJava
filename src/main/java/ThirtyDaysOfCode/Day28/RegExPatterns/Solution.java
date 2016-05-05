package ThirtyDaysOfCode.Day28.RegExPatterns;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String namePattern = "(^[a-z]+)";
        String addressPattern = "(@gmail.com)";

        Pattern nameRegex = Pattern.compile(namePattern, Pattern.CASE_INSENSITIVE);
        Pattern addressRegex = Pattern.compile(addressPattern, Pattern.CASE_INSENSITIVE);

        int tests = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();

        for (int t = 0; t < tests; t++) {
            String inputLine = scanner.nextLine();
            Matcher m = addressRegex.matcher(inputLine);

            if (m.find()) {
                Matcher n = nameRegex.matcher(inputLine);
                if (n.find()) {
                    names.add(n.group());
                }
            }
        }

        names.sort(null);
        for (String name: names) {
            System.out.println(name);

        }
    }
}
