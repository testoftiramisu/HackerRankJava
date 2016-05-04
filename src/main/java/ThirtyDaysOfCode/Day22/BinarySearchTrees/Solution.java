package ThirtyDaysOfCode.Day22.BinarySearchTrees;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        int tests = scanner.nextInt();
        Node root = null;
        while (tests-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}

