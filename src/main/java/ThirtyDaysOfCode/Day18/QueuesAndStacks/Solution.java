package ThirtyDaysOfCode.Day18.QueuesAndStacks;

import java.util.*;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);
    private Deque<Character> stack = new ArrayDeque<>();
    private Queue<Character> queue = new LinkedList<>();

    private void pushCharacter(char ch) {
        this.stack.push(ch);
    }

    private void enqueueCharacter(char ch) {
        this.queue.add(ch);
    }

    private char popCharacter() {
        return this.stack.pop();
    }

    private char dequeueCharacter() {
        return this.queue.poll();
    }

    public static void main(String[] args) {

        String input = scanner.nextLine();
        scanner.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
