package ThirtyDaysOfCode.Day23.BSTLevelOrderTraversal;

import java.util.ArrayDeque;
import java.util.Queue;
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

    static void levelOrder(Node root) {
        Queue<Node> discoveredNodes = new ArrayDeque<>();
        discoveredNodes.add(root);

        while (!discoveredNodes.isEmpty()) {
            Node node = discoveredNodes.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                discoveredNodes.add(node.left);
            }
            if (node.right != null) {
                discoveredNodes.add(node.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data > root.data) {
                cur = insert(root.right, data);
                root.right = cur;
            } else {
                cur = insert(root.left, data);
                root.left = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {

        int t = scanner.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
