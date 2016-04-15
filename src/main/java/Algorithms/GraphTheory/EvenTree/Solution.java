package Algorithms.GraphTheory.EvenTree;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] vertex = new int[n];
        int[] edge = new int[m];

        for (int i = 0; i < m; i++) {
            vertex[i] = scanner.nextInt();
            edge[i] = scanner.nextInt();
        }

        getEdgeCount(vertex, edge);

        System.out.println(count);
    }

    private static void getEdgeCount(int[] vertex, int[] edge) {
        for (int i = 0; i < vertex.length; i++) {
            int a = vertex[i];
            if (Arrays.stream(edge).anyMatch(s -> s == a)) {
                getCutNode(i, vertex, edge);
            }
        }
    }

    private static void getCutNode(int index, int[] vertex, int[] edge) {
        if (countChildren(index, vertex, edge) % 2 != 0) {
            count++;
        }
    }

    private static int countChildren(int index, int[] vertex, int[] edge) {
        int count = 0;
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(vertex[index]);
        while (!queue.isEmpty()) {
            int a = queue.poll();
            for (int i = 0; i < edge.length; i++) {
                if (a == edge[i]) {
                    queue.add(vertex[i]);
                    count++;
                }
            }
        }
        return count;
    }
}
