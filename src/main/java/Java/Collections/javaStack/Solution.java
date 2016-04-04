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
        if ((input.length() % 2) != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            switch (current) {
                case '{':
                case '[':
                case '(':
                    stack.push(input.charAt(i));
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek().equals('{')) {
                        stack.pop();
                    } else {
                        stack.push(current);
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        stack.push(current);
                    }
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        stack.push(current);
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}