package ThirtyDaysOfCode.Day24.MoreLinkedLists;

import java.util.HashSet;
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

    public static Node removeDuplicates(Node head) {
        Node start = head;

        while (start.next != null) {
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }
        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;
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
        int t = scanner.nextInt();
        while (t-- > 0) {
            int element = scanner.nextInt();
            head = insert(head, element);
        }
        head = removeDuplicates(head);
        display(head);
    }
}
