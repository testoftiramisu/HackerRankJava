package Java.Collections.javaStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (scanner.hasNext()) {
            String inputString = scanner.nextLine();

            System.out.println(isBalanced(inputString));
        }
    }

    public static boolean isBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    stack.push(input.charAt(i));
                    break;
                case '}':
                    if (stack.peek().equals('{')) {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    }
                    break;
                case ')':
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}