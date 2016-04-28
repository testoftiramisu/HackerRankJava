package Java.Collections.javaDequeue;

import java.util.*;

class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> numberCounts = new HashMap<>(m);
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (deque.size() == m) {
                int value = deque.removeFirst();
                numberCounts.put(value, numberCounts.get(value) - 1);
                if (numberCounts.get(value) == 0) {
                    numberCounts.remove(value);
                }
            }

            int num = scanner.nextInt();

            if (numberCounts.get(num) == null) {
                numberCounts.put(num, 1);
            } else {
                numberCounts.put(num, numberCounts.get(num) + 1);
            }

            deque.addLast(num);

            int currentMax = numberCounts.size();
            if (currentMax > max) {
                max = currentMax;
            }
        }

        System.out.println(max);
    }
}
