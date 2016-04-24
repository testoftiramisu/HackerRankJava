package ThirtyDaysOfCode.Day15.LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Node head = null;
        int n = scanner.nextInt();
        while (n-- > 0) {
            int element = scanner.nextInt();
            head = insert(head, element);
        }
        display(head);
    }
}

